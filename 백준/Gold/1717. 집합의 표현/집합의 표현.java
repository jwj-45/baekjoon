import java.util.*;
import java.io.*;

public class Main {
	
	static int[] arr;
	public static int find(int v) {
		if(v == arr[v]) {
			return v;
		}
		else {
			return arr[v] = find(arr[v]);
		}
	}
	public static void union(int a, int b) {
		int fa = find(a);
		int fb = find(b);
		if(fa != fb) {
			arr[fa] = fb;
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			arr[i] = i;
		}
	
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a == 0) {
				union(b, c);	
			}
			else if(a == 1) {
				int fb = find(b);
				int fc = find(c);
				
				if(fb == fc) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
		}
	}
}