import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] == 0) {
                for (int j = i; j >= 0; j--) {
                    if (arr[j] != 0) {
                        arr[j] = 0;
                        break;
                    }
                }
            }
        }
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        bw.write(String.valueOf(sum));
        bw.flush();

        bw.close();
        br.close();
    }
}