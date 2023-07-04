import java.util.Scanner;

public class Main {

    public int[] solution(int m, int[] basket, int[][] reverse) {

        for (int i = 0; i < m; i++) {
            int lt = reverse[i][0] - 1;
            int rt = reverse[i][1] - 1;
            while (lt < rt) {
                int tmp = basket[rt];
                basket[rt] = basket[lt];
                basket[lt] = tmp;
                lt++;
                rt--;
            }
        }
        return  basket;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] basket = new int[n];
        int[][] reverse = new int[m][2];

        for (int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                reverse[i][j] = sc.nextInt();
            }
        }

        for (int x : main.solution(m, basket, reverse)) {
            System.out.print(x + " ");
        }
    }
}