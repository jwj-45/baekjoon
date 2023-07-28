import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String croatia = br.readLine();

        for (int i = 0; i < 8; i++) {
            if (croatia.contains(alphabet[i])) {
                croatia = croatia.replace(alphabet[i], "a");
            }
        }
        int len = croatia.length();
        bw.write(String.valueOf(len));

        bw.flush();
        bw.close();
        br.close();
    }
}
