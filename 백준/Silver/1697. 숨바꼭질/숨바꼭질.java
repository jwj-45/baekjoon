import java.io.*;
import java.util.*;

public class Main {

    int[] dis = {1, -1};
    int[] ch;

    Queue<Integer> q = new LinkedList<>();
    public int BFS(int N, int K) {
        if (N == K) {
            return 0;
        }
        ch = new int[100001];
        ch[N] = 1;
        q.offer(N);
        int Lv = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int x = q.poll();
//                System.out.printf("꺼낸 x: %d\n", x);
                for (int j = 0; j < 3; j++) {
                    int nx = x;
                    if (j == 2) {
                        nx += x;
                    }else {
                        nx += dis[j];
                    }
//                    System.out.printf("j: %d | dis[j]: %d | x: %d | nx: %d\n", j, dis[j], x, nx);
                    if (nx == K) {
                        return Lv + 1;
                    }
                    if (nx > 0 && nx <= 100000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            Lv++;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Main main = new Main();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(main.BFS(N, K)));

        bw.flush();
        bw.close();
        br.close();
    }
}
