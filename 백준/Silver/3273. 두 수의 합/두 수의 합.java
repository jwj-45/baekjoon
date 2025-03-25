import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int x = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		int lt = 0;
		int rt = n - 1;
		int cnt = 0;
		while(lt < rt) {
			int sum = arr[lt] + arr[rt];
			if(sum <= x) {
				if(sum == x) {
					cnt++;
				}
				lt++;
			}
			else if(sum > x){
				rt--;
			}
		}
		
		System.out.println(cnt);
	}
}