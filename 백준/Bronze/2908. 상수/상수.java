import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] math = new int[2];

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 2; i++) {
            math[i] = Integer.parseInt(st.nextToken());
            int res = 0;
            while (math[i] > 0) {
                int tmp = math[i] % 10;
                res = res * 10 + tmp;
                math[i] = math[i] / 10;
            }
            math[i] = res;
            if (math[i] > max) {
                max = math[i];
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        br.close();
    }
}
