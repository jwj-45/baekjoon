import java.util.*;
import java.io.*;

public class Main {
	
	    public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n + 1];
			int[] dp = new int[n + 1];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 1; i <= n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			dp[1] = arr[1];
			int ans = dp[1];
			for(int i = 1; i <= n; i++) {
				dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
				ans = Math.max(dp[i], ans);
			}
			
			System.out.println(ans);
		}
}