import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                for (int j = i; j >= 0; j--) {
                    if (arr[j] != 0) {
                        arr[j] = 0;
                        break;
                    }
                }
            }
        }
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println(sum);
    }
}
