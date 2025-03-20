import java.io.*;
import java.util.*;

public class Main {
	
	static int max, cnt, sum;
	public void solution(int[] arr, int n, int x) {
		sum = 0;
		for(int i = 0; i < x; i++) {
			sum += arr[i];
			cnt = 1;
		}

		max = sum;
		for(int i = x; i < n; i++) {
			sum += (arr[i] - arr[i - x]);
			if(max == sum) {
				cnt++;
			}
			else if(max < sum) {
				max = sum;
				cnt = 1;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Main main = new Main();
		main.solution(arr, n, x);
		
		if(max == 0) {
			System.out.println("SAD");
		}
		else {
			System.out.println(max);
			System.out.println(cnt);
		}
	}
}