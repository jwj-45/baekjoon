import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int lt = N-1 , rt = N+1;
        for (int i = 1; i < 2 * N; i++) {
            for (int j = 1; j <= rt; j++) {
                if (j > lt && j < rt) {
                    bw.write("*");
                } else {
                    bw.write(" ");
                }
            }
            if (i < 2 * N - 1) {
                bw.newLine();
            }
            if (i < N) {
                rt++;
                lt--;
            } else {
                rt--;
                lt++;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
