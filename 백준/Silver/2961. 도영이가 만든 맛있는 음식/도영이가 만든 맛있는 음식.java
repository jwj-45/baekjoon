import java.io.*;
import java.util.*;

public class Main {

    private static int n, min = Integer.MAX_VALUE;
    private static int[] sour, bitter;

    public void DFS(int L, int multiSour, int sumBitter, int cnt) {

        if (L == n) {
            if (cnt > 0) {
                min = Math.min(min, Math.abs(multiSour - sumBitter));;
            }
        }
        else {
            DFS(L + 1, multiSour * sour[L], sumBitter + bitter[L], cnt + 1);
            DFS(L + 1, multiSour, sumBitter, cnt);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Main main = new Main();

        n = Integer.parseInt(br.readLine());
        sour = new int[n];
        bitter = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            sour[i] = Integer.parseInt(st.nextToken());
            bitter[i] = Integer.parseInt(st.nextToken());
        }

        main.DFS(0, 1, 0,0);
        bw.write(String.valueOf(min));

        bw.flush();
        bw.close();
        br.close();
    }
}
