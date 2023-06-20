import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int a = sc.nextInt();
//        int b = sc.nextInt();
        double a = sc.nextDouble();
        double b = sc.nextDouble();

//        나눈값이 소수점 아래자리까지 보이게 하려면 double타입의 변수이어야함
        System.out.println(a / b);
    }
}