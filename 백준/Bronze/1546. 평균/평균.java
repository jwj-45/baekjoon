import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] score = new float[n];

        float max = Integer.MIN_VALUE;
        float sum = 0;
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextFloat();
            if (score[i] > max) {
                max = score[i];
            }
        }

        for (int i = 0; i < n; i++) {
            sum += score[i] / max * 100;
        }

        System.out.println(sum / n);
    }
}
