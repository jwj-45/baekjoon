import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[101][101];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int stt = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			for(int j = stt; j < 10 + stt; j++) {
				for(int k = end; k < 10 + end; k++) {
					dp[j][k] = 1;
				}
			}
        }
		
		int cnt = 0;
		for(int j = 1; j <= 100; j++) {
			for(int k = 1; k <= 100; k++) {
				if(dp[j][k] == 1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}

