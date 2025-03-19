import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[][] dp = new int[n + 1][10];
		
		for(int i = 0; i <= 9; i++) {
			dp[1][i] = 1;
		}
		
		for(int i = 2; i <= n; i++) {
			for(int j = 0; j <= 9; j++) {
				for(int k = j; k <= 9; k++) {
					dp[i][j] += (dp[i - 1][k] % 10007);
				}
			}
		}
		
		long sum = 0;
		for(int i = 0; i <= 9; i++) {
			sum += dp[n][i];
		}
		System.out.println(sum % 10007);
	}
}