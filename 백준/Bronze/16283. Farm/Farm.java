import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		int n = Integer.valueOf(st.nextToken());
		int w = Integer.valueOf(st.nextToken());
		
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i = 1; i < n; i++) {
			int sheep = i;
			int goat = n - i;
			if(sheep * a + goat * b == w) {
				answer.add(sheep);
				answer.add(goat);
			}
		}
		
		if(answer.size() != 2) {
			System.out.print(-1);
		}
		else {
			for(int x : answer) {
				System.out.print(x + " ");
			}
		}
		
	}
}