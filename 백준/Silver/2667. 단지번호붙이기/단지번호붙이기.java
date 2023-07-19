import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};
    static int[][] house;
    static int[][] ch;
    static int block , N, cnt;

    public static void findHome(int row, int col) {

        house[row][col] = 0;
        ch[row][col] = block;
        cnt++;

        for (int i = 0; i < 4; i++) {
            int newRow = row + dr[i];
            int newCol = col + dc[i];
            if (newRow >= 0 && newRow < N && newCol >= 0 && newCol < N && house[newRow][newCol] == 1) {
                findHome(newRow, newCol);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();

        N = Integer.parseInt(br.readLine());
        String[] tmp = new String[N];
        house = new int[N][N];
        ch = new int[N][N];

        for (int i = 0; i < N; i++) {
            tmp[i] = br.readLine();
            for (int j = 0; j < tmp[i].length(); j++) {
                String s = String.valueOf(tmp[i].charAt(j));
                house[i][j] = Integer.parseInt(s);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (house[i][j] == 1) {
                    cnt = 0;
                    block++;
                    findHome(i, j);
                    list.add(cnt);
                }
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);

        bw.write(block +"\n");
        for (int x : arr) {
            bw.write(x + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}