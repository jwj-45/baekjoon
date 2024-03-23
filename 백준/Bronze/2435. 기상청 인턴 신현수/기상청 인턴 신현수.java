import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int n = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());
		
		int[] tem = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			tem[i] = Integer.valueOf(st.nextToken());
		}

		int max = Integer.MIN_VALUE;
		int idx = 0;
		while(idx <= n - k) {
			int sum = 0;
			for(int i = idx; i < idx + k; i++) {
				 sum += tem[i];
				 
			}
			max = Math.max(sum, max);
			idx++;
		}
		System.out.println(max);	
	}
}