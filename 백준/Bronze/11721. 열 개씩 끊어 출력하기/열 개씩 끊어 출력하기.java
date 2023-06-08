import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] input = sc.next().toCharArray();
		sc.close();
		
		for(int i = 0; i < input.length; ++i) {
			System.out.print(input[i]);
			if(i % 10 == 9) {
				System.out.println();
			}
			
		}
	}

}
