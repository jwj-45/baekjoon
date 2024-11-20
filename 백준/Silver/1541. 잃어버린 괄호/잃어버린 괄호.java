import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] str = s.split("-|\\+");
		Queue<Integer> q = new LinkedList<>();
		
		for(String t : str) {
			q.offer(Integer.parseInt(t));
		}
		int sum = 0, m = 1;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(!Character.isDigit(c)) {
				sum += m * q.poll();
				if(c == '-') {
					m = -1;
				}
			}
		}
		sum += m * q.poll();
		System.out.println(sum);
	}
}