import java.util.*;
import java.io.*;

public class Main {
	
	    public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n + 1];
			long[] dp = new long[n + 1];
			
			
			for(int i = 1; i <= n; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			
			dp[1] = arr[1];
			if(n > 1) {
				dp[2] = dp[1] + arr[2];
			}
			long ans = dp[1];
			for(int i = 3; i <= n; i++) {
				dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2], dp[i - 3] + arr[i - 1]) + arr[i]);
			}

			System.out.println(dp[n]);
		}
}