import java.io.*;
import java.util.*;

public class Main {
	
	private int[] drow = {1, -1, 0, 0};
	private int[] dcol = {0, 0, 1, -1};
	private static int cnt = 0;
	
	public void dfs(int row, int col, int[][] dp) {
		for(int i = 0; i < 4; i++) {
			int nRow = row + drow[i];
			int nCol = col + dcol[i];
			if(nRow >= 0 && nRow < 101 && nCol >= 0 && nCol < 101 && dp[nRow][nCol] == 1) {
				cnt++;
				dp[nRow][nCol] = 0;
				dfs(nRow, nCol, dp);
			}
		}
	}
	
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
		
		Main main = new Main();
				
		for(int j = 1; j <= 100; j++) {
			for(int k = 1; k <= 100; k++) {
				if(dp[j][k] == 1) {
					main.dfs(j, k, dp);
				}
			}
		}
		System.out.println(cnt);
	}
}