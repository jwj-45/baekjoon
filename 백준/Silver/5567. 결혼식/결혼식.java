import java.io.*;
import java.util.*;

public class Main {

    static int[] relDis;
    static boolean[] isVisited;
    static ArrayList<ArrayList<Integer>> friends;

    public void inviteWedding(int stuNum) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(stuNum);
        isVisited[stuNum] = true;
        while (!queue.isEmpty()) {

            int curStu = queue.poll();
            for (int nextStu : friends.get(curStu)) {
                if (!isVisited[nextStu]) {
                    isVisited[nextStu] = true;
                    relDis[nextStu] = relDis[curStu] + 1;
                    queue.offer(nextStu);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Main main = new Main();

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        friends = new ArrayList<ArrayList<Integer>>();
        relDis = new int[n + 1];
        isVisited = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            friends.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            friends.get(a).add(b);
            friends.get(b).add(a);
        }
        main.inviteWedding(1);

        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if (relDis[i] == 1 || relDis[i] == 2) {
                cnt++;
            }
        }
        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
