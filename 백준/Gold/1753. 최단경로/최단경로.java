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
	public void solution(int k) {
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		pq.offer(new Edge(k, 0));
		while(!pq.isEmpty()) {
			Edge ce = pq.poll();
			if(dis[ce.v] > ce.c) {
				dis[ce.v] = ce.c;
				for(Edge ne : list.get(ce.v)) {
					pq.offer(new Edge(ne.v, ce.c + ne.c));
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int v = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(br.readLine());
		
		list = new ArrayList<ArrayList<Edge>>();
		dis = new int[v + 1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		
		for(int i = 0; i <= v; i++) {
			list.add(new ArrayList<Edge>());
		}
		for(int i = 0; i < e; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			list.get(a).add(new Edge(b, c));
		}
		Main main = new Main();
		main.solution(k);
		for(int i = 1; i <= v; i++) {
			if(dis[i] < Integer.MAX_VALUE) {
				System.out.println(dis[i]);
			}
			else {
				System.out.println("INF");
			}
		}
	}
}