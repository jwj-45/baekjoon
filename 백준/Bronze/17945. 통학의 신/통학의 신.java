import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int[] answer = new int[2];
		
		answer[0] = (-a + (int) Math.sqrt(a*a - b));
		answer[1] = (-a - (int) Math.sqrt(a*a - b));
		
		Arrays.sort(answer);
		
		if(answer[0] == answer[1]) {
			System.out.print(answer[0]);
		}
		else {
			for(int x : answer) {
				System.out.print(x + " ");
			}
		}
		
	}
}