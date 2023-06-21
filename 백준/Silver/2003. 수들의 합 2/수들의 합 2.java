import java.util.Scanner;

public class Main {

    public int solution(int n, int m, int[] arr) {

        int cnt = 0;
        int lt = 0;
        int sum = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            while (sum >= m) {
                if (sum == m) {
                    cnt++;
                }
                sum -= arr[lt++];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main b2 = new Main();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(b2.solution(n,m,arr));
    }
}