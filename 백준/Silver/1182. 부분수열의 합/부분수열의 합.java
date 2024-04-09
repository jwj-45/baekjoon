import java.io.*;
import java.util.*;

public class Main {
	
	private static int cnt = 0;
	private static int[] ch;
	
	public void dfs(int idx, int[] seq, int n, int s) {
		if(idx == n) {
			int sum = 0;
			for(int i = 0; i < n; i++) {
				if(ch[i] == 1) {
					sum += seq[i];
//					System.out.print(seq[i] + " ");
				}
			}
//			System.out.printf("|| sum=%d\n", sum);
			if(sum == s) {
				cnt++;
			}
		}
		else {
			ch[idx] = 1;
			dfs(idx + 1, seq, n, s);
			ch[idx] = 0;
			dfs(idx + 1, seq, n, s);
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int[] seq = new int[n];
		ch = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		Main main = new Main();
		main.dfs(0, seq, n, s);
		
		if(s == 0) {
			cnt--;
		}
		System.out.println(cnt);
	}
}