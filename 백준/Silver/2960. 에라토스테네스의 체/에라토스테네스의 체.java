import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n + 1];
        int cnt = 0;
        int index = 0;

        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                for (int j = i; j <= n; j += i) {
                    if (arr[j] != 1) {
                        cnt++;
                        arr[j] = 1;
                        if (cnt == k) {
                            index = j;
                        }
                    }
                }
            }
        }
        System.out.println(index);
    }
}