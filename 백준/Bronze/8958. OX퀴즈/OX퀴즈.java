import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] str = new String[t];

        for(int i = 0; i < t; i++) {
            str[i] = sc.next();
        }

        for(int i = 0; i < t; i++) {

            String s = str[i];
            int sum = 0;
            int add = 1;
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == 'O') {
                    sum += add;
                    add++;
                }
                else {
                    add = 1;
                }
            }
            System.out.println(sum);
        }
    }
}