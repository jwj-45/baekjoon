import java.io.*;
import java.util.*;

public class Main {

    private static ArrayList<ArrayList<Integer>> graph;
    private static int[] ch, che;
    private static StringBuilder dfsAns = new StringBuilder();
    private static StringBuilder bfsAns = new StringBuilder();

    public void dfs(int v) {
        dfsAns.append(v).append(" ");
        Collections.sort(graph.get(v));
        for (int x : graph.get(v)) {
            if (ch[x] == 0) {
                ch[x] = 1;
                dfs(x);
            }
        }
    }

 	public void bfs(int v) {
		Queue<Integer> qu = new LinkedList<>();
		qu.offer(v);
		while(!qu.isEmpty()) {
			int len = qu.size();
			for(int i = 0; i < len; i++) {
                int tmp = qu.poll();
                Collections.sort(graph.get(tmp));
                if (che[tmp] == 0) {
                    che[tmp] = 1;
                    bfsAns.append(tmp).append(" ");
                    for (int x : graph.get(tmp)) {
                        qu.offer(x);
                    }
                }
            }
		}

	}

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        ch = new int[n + 1];
        che = new int[n + 1];

        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 1; i <= n + 1; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        Main main = new Main();
        ch[v] = 1;
        main.dfs(v);
		main.bfs(v);
        System.out.println(dfsAns);
        System.out.println(bfsAns);

    }
}