import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];
        for (int i = 0; i < 30; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < 28; i++) {
            int n = sc.nextInt();
            arr[n - 1] = 0;
        }
        for (int x : arr) {
            if (x != 0) {
                System.out.println(x);
            }
        }
    }
}
