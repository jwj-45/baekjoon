import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> qu = new PriorityQueue<>();
		
		int n = Integer.parseInt(br.readLine());
		int ans = 0;
		
		for(int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(br.readLine());
			qu.offer(tmp);
		}
		while(qu.size() != 1) {
			int a = qu.poll();
			int b = qu.poll();
			ans += a + b;
			qu.offer(a + b);
		}
		System.out.println(ans);
	}
}