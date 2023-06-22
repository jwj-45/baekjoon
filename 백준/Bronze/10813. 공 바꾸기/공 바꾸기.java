import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int tmp = 0;
        int[][] arr = new int[m][2];
        int[] str = new int[n];

        for (int i = 0; i < n; i++) {
            str[i] = i + 1;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < m; i++) {
            tmp = str[arr[i][1] - 1];
            str[arr[i][1] - 1] = str[arr[i][0] - 1];
            str[arr[i][0] - 1] = tmp;
        }

        for (int x : str) {
            System.out.print(x + " ");
        }
    }
}
