import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = sc.next();
        int sum = 0;

        for (int i = 0; i < n; i++) {
//            int a = input.charAt(i); => charAt하면 char 타입이므로 아스키코드값으로 int로 형변환
//            숫자 0 ~ 9 까지 값 아스키 코드로 변환하면 --> 48 ~ 57
            String a = String.valueOf(input.charAt(i));
            sum += Integer.parseInt(a);
        }
        System.out.println(sum);
    }
}
