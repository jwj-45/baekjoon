import java.io.*;
import java.util.*;

public class Main {
	
	public ArrayList<Integer> prime() {
		ArrayList<Integer> list = new ArrayList<>();
		int[] arr = new int[1000001];
		for(int i = 2; i < 1000001; i++) {
			if(arr[i] == 0) {
				list.add(i);
				for(int j = i; j < 1000001; j += i) {
					arr[j] = 1;
				}
			}
		}
		return list;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Main main = new Main();
		ArrayList<Integer> prime = main.prime();
		
		for(int i = 0; i < n; i++) {
			long s = Long.parseLong(br.readLine());
			String answer = "YES";
			for(int x : prime) {
				if(s % x == 0) {
					answer = "NO";
					break;
				}
			}
			System.out.println(answer);
		}
	}
}

