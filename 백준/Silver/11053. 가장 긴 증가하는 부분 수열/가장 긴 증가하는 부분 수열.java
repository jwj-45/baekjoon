import java.io.*;
import java.util.*;

public class Main {
	
	static int n;
	public int solution(int[] arr) {
		int ans = 1;
		int[] dp = new int[n];
		dp[0] = 1;
		
		for(int i = 1; i < n; i++) {
			int max = 0;
			for(int j = i - 1; j >= 0; j--) {
				if(arr[i] > arr[j] && dp[j] > max) {
					max = Math.max(dp[j], max);
				}
			}
			dp[i] = max + 1;
			ans = Math.max(dp[i], ans);
		}
		return ans;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
				
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Main main = new Main();
		
		System.out.println(main.solution(arr));
	}
}