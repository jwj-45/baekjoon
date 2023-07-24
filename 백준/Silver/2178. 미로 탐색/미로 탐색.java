import java.io.*;
import java.util.*;

class Coordinate {

    int row;
    int col;

    Coordinate(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}

public class Main {

    int[] drow = {1, -1, 0, 0};
    int[] dcol = {0, 0, 1, -1};
    static int N, M;
    static int[][] maze, distance;
    Queue<Coordinate> q = new LinkedList<>();

    public void findRoot(int row, int col) {

        maze[row][col] = 0;
        distance[row][col] = 1;
        q.offer(new Coordinate(row, col));
        while (!q.isEmpty()) {
            Coordinate c = q.poll();
            for (int i = 0; i < 4; i++) {
                int nRow = c.getRow() + drow[i];
                int nCol = c.getCol() + dcol[i];
                if (nRow >= 1 && nRow <= N && nCol >= 1 && nCol <= M && maze[nRow][nCol] == 1) {
                    maze[nRow][nCol] = 0;
                    distance[nRow][nCol] = distance[c.getRow()][c.getCol()] + 1;
                    q.offer(new Coordinate(nRow, nCol));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Main main = new Main();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        maze = new int[N + 1][M + 1];
        distance = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= M; j++) {
                maze[i][j] = Integer.parseInt(String.valueOf(str.charAt(j-1)));
            }
        }

        main.findRoot(1, 1);
        bw.write(String.valueOf(distance[N][M]));

        bw.flush();
        bw.close();
        br.close();
    }
}
