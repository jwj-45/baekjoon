import java.util.*;
import java.io.*;

class Lecture implements Comparable<Lecture> {
	
	int stt;
	char ste;
	
	public Lecture(int stt, char ste) {
		this.stt = stt;
		this.ste = ste;
	}
	@Override
	public int compareTo(Lecture o) {
		if(this.stt == o.stt) {
			return this.ste - o.ste;
		}
		return this.stt - o.stt;
	}
}

public class Main {
	
	public int solution(ArrayList<Lecture> list) {
		int max = Integer.MIN_VALUE, cnt = 0;
		for(Lecture o : list) {
			if(o.ste == 's') {
				cnt++;
			}
			else if(o.ste == 'e') {
				cnt--;
			}
			max = Math.max(max, cnt);
		}
		return max;
	}
		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Lecture> list = new ArrayList<>();
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int num = Integer.parseInt(st.nextToken());
			int stt = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			list.add(new Lecture(stt, 's'));
			list.add(new Lecture(end, 'e'));
		}
		Collections.sort(list);

		Main main = new Main();
		System.out.println(main.solution(list));
	}
}