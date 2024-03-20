import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int num = 0;
		int i = 0;
		while(true) {
			num = (int) Math.pow(3, i);
			if(num >=0 && num < Integer.MAX_VALUE) {
				list.add(num);
				i++;
			}		
			else {
				break;
			}
		}
		
		String answer = "YES";
		
		int idx1 = Integer.MIN_VALUE;
		int idx2 = Integer.MIN_VALUE;
		int maxVal = 0;
		if(input == 0) {
			answer = "NO";
		}
		while(input != 0) {
			for(int j = 0; j < list.size(); j++) {
				if(list.get(j) > input) {
					break;
				}
				maxVal = list.get(j);
				idx1 = j;
			}
			input -= maxVal;
			if(idx1 == idx2) {
				answer = "NO";
				break;
			}
			else {
				idx2 = idx1;
			}
		}
		System.out.println(answer);
	}
}
	