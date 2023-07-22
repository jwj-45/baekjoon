import java.io.*;
import java.util.*;

class Point {

    int row;
    int col;
    int hei;

    Point(int row, int col, int hei) {
        this.row = row;
        this.col = col;
        this.hei = hei;
    }
}

public class Main {

    int[] drow = {1, -1, 0, 0, 0, 0};
    int[] dcol = {0, 0, 1, -1, 0, 0};
    int[] dhei = {0, 0, 0, 0, 1, -1};
    static int N, M, H;
    static int[][][] tomato, days;
    static Queue<Point> q = new LinkedList<>();;

    public void ripenTime() {

        while (!q.isEmpty()) {
            Point p = q.poll();
            for (int i = 0; i < 6; i++) {
                int newRow = p.row + drow[i];
                int newCol = p.col + dcol[i];
                int newHei = p.hei + dhei[i];
//                System.out.print(p.row +" " + p.col +" " + p.hei + " --> ");
//                System.out.println(newRow + " " + newCol +" " + newHei);
                if (newRow >= 0 && newRow < M && newCol >= 0 && newCol < N && newHei >= 0 && newHei < H && tomato[newRow][newCol][newHei] == 0) {
                    tomato[newRow][newCol][newHei] = 1;
                    days[newRow][newCol][newHei] = days[p.row][p.col][p.hei] + 1;
                    q.offer(new Point(newRow, newCol, newHei));
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
        H = Integer.parseInt(st.nextToken());
        tomato = new int[M][N][H];
        days = new int[M][N][H];
        int minDay = Integer.MIN_VALUE;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < M; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < N; k++) {
                    tomato[j][k][i] = Integer.parseInt(st.nextToken());;
                }
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if (tomato[j][k][i] == 1) {
                        q.offer(new Point(j, k, i));
                    }
                }
            }
        }
        main.ripenTime();

        boolean allRipenTomato = true;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if (tomato[j][k][i] == 0) {
                        allRipenTomato = false;
                    }
                }
            }
        }

        if (!allRipenTomato) {
            minDay = -1;
        } else {
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < M; j++) {
                    for (int k = 0; k < N; k++) {
                        minDay = Math.max(minDay, days[j][k][i]);
                    }
                }
            }
        }
        bw.write(String.valueOf(minDay));

        bw.flush();
        bw.close();
        br.close();

    }
}