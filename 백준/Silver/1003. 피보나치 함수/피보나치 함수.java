import java.util.*;
import java.io.*;

class Count {
	int zero;
	int one;
	
	public Count(int zero, int one) {
		this.zero = zero;
		this.one = one;
	}
}

public class Main {
	
	public Count[] solution(int n) {
		Count[] cnt = new Count[n + 1];
		cnt[0] = new Count(1, 0);
        if(n > 0) {
			cnt[1] = new Count(0, 1);
			
			for(int i = 2; i <= n; i++) {
				int zero = cnt[i - 1].zero + cnt[i - 2].zero;
				int one = cnt[i - 1].one + cnt[i - 2].one;
				
				cnt[i] = new Count(zero, one);
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
				
		int[] arr = new int[t];
		Main main = new Main();
		
		int max = 0;
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			max = Math.max(max, n);
			arr[i] = n;
		}
		Count[] cnt = main.solution(max);
		
		for(int i = 0; i < arr.length; i++) {
			int idx = arr[i];
			System.out.printf("%d %d\n", cnt[idx].zero, cnt[idx].one);
		}
	}
}