import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int lt = N-1 , rt = N+1;
        for (int i = 1; i < 2 * N; i++) {
            for (int j = 1; j <= rt; j++) {
                if (j > lt && j < rt) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (i < 2 * N - 1) {
                System.out.println();
            }
            if (i < N) {
                rt++;
                lt--;
            } else {
                rt--;
                lt++;
            }
        }
    }
}
