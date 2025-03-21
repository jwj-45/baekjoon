import java.io.*;
import java.util.*;

class Edge implements Comparable<Edge> {
	
	int v;
	int c;
	
	public Edge(int v, int c) {
		this.v = v;
		this.c = c;		
	}
	
	@Override
	public int compareTo(Edge e) {
		return this.c - e.c;
	}
}

public class Main {    

	static List<ArrayList<Edge>> list;
	public int solution(int n, int m, int s, int t) {
		int[] dis = new int[n + 1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		pq.offer(new Edge(s, 0));
		dis[s] = 0;
		
		while(!pq.isEmpty()) {
			Edge tmp = pq.poll();
			int v = tmp.v;
			int c = tmp.c;
			
			if(dis[v] < c) {
				continue;
			}
			for(Edge e : list.get(v)) {
				if(dis[e.v] > c + e.c) {
					dis[e.v] = c + e.c;
					pq.offer(new Edge(e.v, c + e.c));
				}
			}
		}
		return dis[t];
	}
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		list = new ArrayList<ArrayList<Edge>>();
		
		for(int i = 0; i <= n; i++) {
			list.add(new ArrayList<Edge>());
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			list.get(a).add(new Edge(b, c));
			list.get(b).add(new Edge(a, c));
		}
		st = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		Main main = new Main();
		
		System.out.println(main.solution(n, m, s, t));
	}
}
