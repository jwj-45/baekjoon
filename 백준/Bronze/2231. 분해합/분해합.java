import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int a = 1;
        int answer = 0;
        while (a < n) {
            String tmp = String.valueOf(a);
            int sum = 0;
            for (int i = 0; i < tmp.length(); i++) {
                sum += Integer.parseInt(String.valueOf(tmp.charAt(i)));
            }
            if (sum + a == n) {
                answer = a;
                break;
            }
            a++;
        }
        System.out.println(answer);
    }
}