import java.io.*;
import java.util.*;

public class Main {


	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] num = new int[5];
		
		for(int i = 0; i < 5; i++) {
			num[i] = Integer.valueOf(st.nextToken());
		}
		
		int demo = 1;
		while(true) {
			int cnt = 0;
			for(int x : num) {
				if(demo % x == 0) {
					cnt++;
				}
			}
			if(cnt >= 3) {
				break;
			}
			demo++;
		}
		System.out.println(demo);
	}
}