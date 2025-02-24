import java.util.*;
import java.io.*;

class Bag {
	int w;
	int v;
	
	public Bag(int w, int v) {
		this.w = w;
		this.v = v;
	}
}

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] dy = new int[k + 1];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int w = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			for(int j = k; j >= w; j--) {
				dy[j] = Math.max(dy[j], dy[j - w] + v);
			}
		}
		System.out.println(dy[k]);
	}
}