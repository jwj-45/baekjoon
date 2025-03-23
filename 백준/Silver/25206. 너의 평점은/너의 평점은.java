import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Double> map = new HashMap<>();
		
		map.put("A+", 4.5);
		map.put("A0", 4.0);
		map.put("B+", 3.5);
		map.put("B0", 3.0);
		map.put("C+", 2.5);
		map.put("C0", 2.0);
		map.put("D+", 1.5);
		map.put("D0", 1.0);
		map.put("F", 0.0);
		
		StringTokenizer st;
		double sum1 = 0;
		double sum2 = 0;
		for(int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			
			String s = st.nextToken();
			double g = Double.parseDouble(st.nextToken());
			String t = st.nextToken();
			
			if(map.containsKey(t)) {
				sum1 += (g * map.get(t));
				sum2 += g;
			}
		}
		System.out.println(sum1 / sum2);
	}
}