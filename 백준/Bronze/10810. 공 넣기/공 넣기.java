import java.util.Scanner;

public class Main {

    public int[] solution(int n, int m, int[][] arr){

        int basket[] = new int[n];

        for (int i = 0; i < m; i++) {

            int lt = arr[i][0];
            int rt = arr[i][1];
            int a = arr[i][2];

            for (int j = lt; lt <= rt; lt++) {
                basket[lt - 1] = a;
            }
        }

        return basket;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main b = new Main();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[m][3];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int x : b.solution(n, m, arr)) {
            System.out.print(x + " ");
        }
    }
}