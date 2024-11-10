import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n + 1];

		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		long sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += Math.abs(i - arr[i]);
		}
		
		System.out.println(sum);
	}
}