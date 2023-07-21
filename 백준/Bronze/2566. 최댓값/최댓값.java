import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[10][10];
        int max = Integer.MIN_VALUE;
        int idxRow = 0, idxCol = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                arr[i][j] = sc.nextInt();
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    idxRow = i;
                    idxCol = j;
                }
            }
        }

        System.out.println(max);
        System.out.print(idxRow + " " + idxCol);
    }
}
