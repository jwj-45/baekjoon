import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int W, H;
    static int[] dw = {-1, 0, 1, 0, 1, -1, 1, -1};
    static int[] dh = {0, 1, 0, -1, 1, -1, -1, 1};
    static int[][] island;

    public void DFS(int h, int w) {

        island[h][w] = 0;
        for (int i = 0; i < 8; i++) {
            int nh = h + dh[i];
            int nw = w + dw[i];
            if (nw >= 0 && nw < W && nh >= 0 && nh < H && island[nh][nw] == 1) {
                DFS(nh, nw);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Main main = new Main();

        while (true) {

            st = new StringTokenizer(br.readLine());
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());

            if (W == 0 && H == 0) {
                break;
            }

            island = new int[H][W];
            for (int i = 0; i < H; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < W; j++) {
                    island[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int cnt = 0;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (island[i][j] == 1) {
                        cnt++;
                        main.DFS(i, j);
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
