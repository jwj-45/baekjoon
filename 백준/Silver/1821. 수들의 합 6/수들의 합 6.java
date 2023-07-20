import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int N, F;
    static int[] multi, number, check;
    int[][] combi = new int[11][11];
    static boolean success = false;
    static BufferedWriter bw;

    public int combination(int n, int r) {

        if (combi[n][r] > 0) {
            return combi[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        }
        else {
            return combi[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
        }
    }

    public void findSequence(int cnt, int sum) throws IOException {

        if (success) {
            return;
        }
        if (cnt == N ) {
            if(sum == F) {
                success = true;
                for (int x : number) {
                    bw.write(x +" ");
                }
            }
        }
        else {
            for (int i = 1; i <= N; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    number[cnt] = i;
                    findSequence(cnt + 1, sum + (multi[cnt] * number[cnt]));
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Main main = new Main();

        N = Integer.parseInt(st.nextToken());
        F = Integer.parseInt(st.nextToken());
        multi = new int[N];
        number = new int[N];
        check = new int[N + 1];

        for (int i = 0; i < N; i++) {
            multi[i] = main.combination(N - 1, i);
        }
        main.findSequence(0, 0);

        bw.flush();
        bw.close();
        br.close();
    }
}