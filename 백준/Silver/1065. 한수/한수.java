import java.io.*;
import java.util.*;

public class Main {
	
	public boolean hanNum(int num) {
		if(num < 100) {
			return true;
		}
		ArrayList<Integer> remain = new ArrayList<>();
		while(num > 0) {
			int rem = num % 10;
			remain.add(rem);
			num /= 10;
		}
		return checkAP(remain);
	}
	
	public boolean checkAP(ArrayList<Integer> remain) {
		for(int i = 1; i < remain.size() - 1; i++) {
			int d1 = remain.get(i - 1) - remain.get(i);
			int d2 = remain.get(i) - remain.get(i + 1);
			if(d1 != d2) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Main main = new Main();
		
		int cnt = 0, num = 1;
		while(num <= n) {
			if(main.hanNum(num)) {
				cnt++;
			}
			num++;
		}
		System.out.println(cnt);
	}
}