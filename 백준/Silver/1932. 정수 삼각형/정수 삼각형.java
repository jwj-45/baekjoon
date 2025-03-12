import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n + 1];
		int[][] dp = new int[n][n + 1];
		
		for(int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");
			for(int j = 0; j < s.length; j++) {
				arr[i][j + 1] = Integer.parseInt(s[j]);
			}
		}
		
		dp[0][1] = arr[0][1];
		int ans = dp[0][1];
		for(int i = 1; i < n; i++) {
			for(int j = 1; j <= n; j++) {
				dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + arr[i][j];
				ans = Math.max(ans, dp[i][j]);
			}
		}
		System.out.println(ans);
	}
}