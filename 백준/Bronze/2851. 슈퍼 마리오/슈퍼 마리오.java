import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] mario = new int[10];
		
		for(int i = 0; i < 10; i++) {
			mario[i] = Integer.parseInt(br.readLine());
		}
		
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum += mario[i];
			int tmp = Math.abs(100 - sum);
			if(min > tmp) {
				min = tmp;
			}
			else if(min == tmp) {
				break;
			}
			else {
				sum -= mario[i];
				break;
			}
		}
		System.out.println(sum);
	}
}