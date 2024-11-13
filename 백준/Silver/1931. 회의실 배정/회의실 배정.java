import java.util.*;
import java.io.*;

class Time implements Comparable<Time> {
	int stt;
	int end;
	
	public Time(int stt, int end) {
		this.stt = stt;
		this.end = end;
	}
	
	@Override
	public int compareTo(Time t) {
		if(this.end == t.end) {
			return this.stt - t.stt;
		}
		return this.end - t.end;
	}
}

public class Main {
	
	public int solution(ArrayList<Time> list) {
		int end = 0, cnt = 0;
		for(Time t : list) {
			if(t.stt >= end) {
				cnt++;
				end = t.end;
			}
		}
		return cnt;
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Time> list = new ArrayList<>();
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list.add(new Time(a, b));
		}
		Collections.sort(list);
		
		Main main = new Main();
		System.out.println(main.solution(list));
	}
}