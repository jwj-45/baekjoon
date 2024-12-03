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
	static int[] dis;
	public void solution(int a) {
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		pq.offer(new Edge(a, 0));
		while(!pq.isEmpty()) {
			Edge ce = pq.poll();
			if(dis[ce.v] > ce.c) {
				dis[ce.v] = ce.c;
				for(Edge ne : list.get(ce.v)) {
					pq.offer(new Edge(ne.v, ne.c + ce.c));
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		list = new ArrayList<ArrayList<Edge>>();
		dis = new int[n + 1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		
		for(int i = 0; i <= n; i++) {
			list.add(new ArrayList<Edge>());
		}
		for(int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			list.get(a).add(new Edge(b, c));
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		Main main = new Main();
		main.solution(a);
		
		System.out.println(dis[b]);
	}
}
