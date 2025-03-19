import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int mod = 1000000000;
		
		long[][] dp = new long[n + 1][10];
		
		for(int i = 0; i <= 9; i++) {
			dp[1][i] = 1;
		}
		
		for(int i = 2; i <= n; i++) {
			for(int j = 0; j <= 9; j++) {
				if(j == 0) {
					dp[i][j] = dp[i - 1][j + 1]%mod;
				}
				else if(j == 9) {
					dp[i][j] = dp[i - 1][j - 1]%mod;
				}
				else {
					dp[i][j] = (dp[i - 1][j + 1]%mod + dp[i - 1][j - 1]%mod)%mod;
				}
			}
		}
		int sum = 0;
		for(int i = 1; i <= 9; i++) {
			sum += dp[n][i];
			sum%=mod;
		}
		System.out.println(sum%=mod);
	}
}