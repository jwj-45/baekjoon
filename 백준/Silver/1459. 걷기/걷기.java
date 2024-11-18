import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long x = Integer.parseInt(st.nextToken());
		long y = Integer.parseInt(st.nextToken());
		long w = Integer.parseInt(st.nextToken());
		long s = Integer.parseInt(st.nextToken());
		
		long sum = 0;
		
		if(y > x) {
			long tmp = x;
			x = y;
			y = tmp;
		}
		
		if(2 * w > s) {
			long a = w * (x - y);
			long b = 2 * ((x - y) / 2) * s + w * ((x - y) % 2);
			sum += y * s;
			sum += Math.min(a, b);
		}
		else {
			sum += w * (x + y);
		}
		System.out.println(sum);
	}
}