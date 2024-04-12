import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int answer = 0;
        
        for(int i = 1; i < n; i++) {
            int sum = 0;
            int num = i;
            while (0 < num) {
                sum += num % 10;
                num /= 10;
            }
            if(sum + i == n) { 
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}