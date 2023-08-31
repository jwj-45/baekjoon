import java.io.*;
import java.util.*;

public class Main {

    Queue<Integer> queue = new LinkedList<>();
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] isVisited;
    static int[] distance;
    static int n, m;

    public void bfs(int a) {
        queue.offer(a);
        isVisited[a] = true;
        while (!queue.isEmpty()) {
            int cPerson = queue.poll();
            for (int nPerson : graph.get(cPerson)) {
                if (!isVisited[nPerson]) {
                    isVisited[nPerson] = true;
                    distance[nPerson] = distance[cPerson] + 1;
                    queue.offer(nPerson);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Main main = new Main();

        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());

        graph = new ArrayList<ArrayList<Integer>>();
        isVisited = new boolean[n + 1];
        distance = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        main.bfs(a);
        int answer;
        if (distance[b] != 0) {
            answer = distance[b];
        } else {
            answer = -1;
        }
        bw.write(answer +"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
