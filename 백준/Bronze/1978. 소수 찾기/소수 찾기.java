import java.io.*;
import java.util.*;

public class Main { 

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] ch = new int[1001];
		ArrayList<Integer> prime = new ArrayList<>();
		for(int i = 2; i < 1001; i++) {
			if(ch[i] == 0) {
				prime.add(i);
				for(int j = i; j < 1001; j += i) {
					ch[j] = 1;
				}
			}
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if(prime.contains(tmp)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
