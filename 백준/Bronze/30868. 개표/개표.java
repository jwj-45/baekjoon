import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        for(int i =  0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            String answer = "";
            while(n != 0) {
                if(n % 5 == n) {
                    for(int j = 0; j < n; j++){
                        answer += "|";
                    }
                    n /= 5;
                }
                else {
                    for(int j = 0; j < n / 5; j++) {
                        answer += "++++ ";
                    }
                    n %= 5;
                }
            }
            System.out.println(answer.trim());
        }
    }
}