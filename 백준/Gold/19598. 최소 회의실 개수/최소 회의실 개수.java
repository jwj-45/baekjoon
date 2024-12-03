import java.io.*;
import java.util.*;

class Time implements Comparable<Time> {
	int  t;
	char c;
	
	public Time(int t, char c) {
		this.t = t;
		this.c = c;
	}
	
	@Override
	public int compareTo(Time o) {
		if(this.t == o.t) {
			return this.c - o.c;
		}
		else {
			return this.t - o.t;
		}
	} 
}

public class Main {
	
	public int solve(List<Time> list) {
		int cnt = 0, ans = 0;
		for(Time t : list) {
			if(t.c == 's') {
				cnt++;
			}
			else if(t.c == 'e') {
				cnt--;
			}
			ans = Math.max(cnt, ans);
		}
		return ans;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		List<Time> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int t = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			list.add(new Time(t, 's'));
			list.add(new Time(c, 'e'));
		}
		Collections.sort(list);
		Main main = new Main();
		int ans = main.solve(list);
		
		System.out.println(ans);
	}
}