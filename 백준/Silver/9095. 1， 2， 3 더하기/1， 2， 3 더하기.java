import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] dp = new int[11];
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			for(int j = 4; j < 11; j++) {
				dp[j] = dp[j - 1] + dp [j - 2] + dp[j - 3];
			}
			System.out.println(dp[n]);
		}
	}
}