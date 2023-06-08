import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		int count = 0;
		sc.close();
		
		for(int i = 0; i < arr.length; i++) {
			if(!arr[i].equals("")) {
				count++;
			}
		}
		System.out.print(count);
	}

}