import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            String a = sc.next();
            String b = sc.next();
            
            int A = Integer.parseInt(a);
            int B = Integer.parseInt(b);
            System.out.println(A + B);

        }
        sc.close();
    }
}