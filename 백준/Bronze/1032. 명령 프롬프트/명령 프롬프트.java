import java.util.Scanner;

public class Main {

    public String solution(int n, String[] str) {
        
        String answer = str[0];

        for (int j = 0; j < str[0].length(); j++) {
            for (int k = 1; k < n; k++) {
                char ci = str[0].charAt(j);
                char cj = str[k].charAt(j);
                if (ci != cj) {
                    answer = answer.substring(0, j) + "?" + answer.substring(j + 1);
                    break;
                }
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main b = new Main();
        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
             str[i] = sc.next();
        }

        System.out.println(b.solution(n, str));
        
    }
}