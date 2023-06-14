import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        int sum= 0;
        int num = 1;
        int count = 0;
        int[] arr = new int[b + 1];

        for(int i = 0; i < b + 1; i++) {
            arr[i] = num;
            count++;
            if(count == num) {
                num++;
                count = 0;
            }
        }
        for(int i = a; i <= b; i++) {
            sum += arr[i];
        }
        System.out.print(sum);
    }
}