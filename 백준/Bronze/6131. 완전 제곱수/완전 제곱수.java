import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int a = 1;
		
		while(a <= 500) {	
			int sa = (int) Math.pow(a, 2);
			for(int b = 1; b <= a; b++) {
				int sb = (int) Math.pow(b, 2);
				if(sa - sb == n) {
					cnt++;
					break;
				}
			}
			a++;
		}
		System.out.println(cnt);
	}
}