import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[5];
		
		int max = 0;
		for(int i = 0; i < 5; i++) {	
			str[i] = br.readLine();
			max = Math.max(max, str[i].length());
		}
		
		StringBuilder sb = new StringBuilder();
		int col = 0;
		while(col < max) {
			for(int i = 0; i < 5; i++) {
				int len = str[i].length();
				if(col >= len) {
					continue;
				}
				sb.append(str[i].charAt(col));
			}
			col++;
		}
		System.out.println(sb);
	}
}