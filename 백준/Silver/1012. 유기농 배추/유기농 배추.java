import java.io.*;
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

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Main main = new Main();

        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            cabbage = new int[M][N];

            for (int j = 0; j < K; j++) {

                st = new StringTokenizer(br.readLine());
                int idxRow = Integer.parseInt(st.nextToken());
                int idxCol = Integer.parseInt(st.nextToken());
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
            bw.write(cnt +"\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
