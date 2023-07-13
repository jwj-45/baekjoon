import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] dial = {"", "", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", ""};

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = 0; j < 12; j++) {
                if (dial[j].contains(String.valueOf(c))) {
                    sum += j;
                }
            }
        }
        bw.write(String.valueOf(sum));
        
        bw.flush();
        bw.close();
        br.close();
    }
}