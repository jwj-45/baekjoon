import java.util.*;

public class Main {

    int[] drow = {1, -1, 0, 0};
    int[] dcol = {0, 0, 1, -1};
    static int M, N, K;
    static int[][] cabbage;


    public void cabbageWarm(int row, int col) {

        cabbage[row][col] = 0;
        for (int i = 0; i < 4; i++) {
            int newRow = row + drow[i];
            int newCol = col + dcol[i];
            if (newRow >= 0 && newRow < M && newCol >= 0 && newCol < N && cabbage[newRow][newCol] == 1) {
                cabbageWarm(newRow, newCol);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main main = new Main();

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {

            M = sc.nextInt();
            N = sc.nextInt();
            K = sc.nextInt();
            cabbage = new int[M][N];

            for (int j = 0; j < K; j++) {
                int idxRow = sc.nextInt();
                int idxCol = sc.nextInt();
                cabbage[idxRow][idxCol] = 1;
            }

            int cnt = 0;
            for (int j = 0; j < M; j++) {
                for (int p = 0; p < N; p++) {
                    if (cabbage[j][p] == 1) {
                        cnt++;
                        main.cabbageWarm(j, p);
                    }
                }
            }
            System.out.println(cnt);

        }
    }
}
