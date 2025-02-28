import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		long[][] dp = new long[15][15];
		
		for(int i = 1; i <= 14; i++) {
			dp[0][i] = i;
		}
		
		for(int i = 1; i <= 14; i++) {
			for(int j = 1; j <= 14; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}
		
		for(int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			System.out.println(dp[k][n]);
		}
	}
}