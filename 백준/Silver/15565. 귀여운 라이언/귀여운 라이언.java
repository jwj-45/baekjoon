import java.util.Scanner;

public class Main {

    public int solution(int n, int m, int[] arr) {

        int count = 0;
        int lt = 0;
        int cnt = 0;
        int min = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }

        if (count < m) {
            min = -1;
        } else {
            for (int rt = 0; rt < n; rt++) {
                if (arr[rt] == 1) {
                    cnt++;
                    if (cnt == m) {
                        if (arr[lt] == 1) {
                            min = Math.min(min, rt - lt + 1);
                            lt++;
                        } else {
                            while (arr[lt] != 1) {
                                lt++;
                            }
                            min = Math.min(min, rt - lt + 1);
                            lt++;
                        }
                        cnt--;
                    }
                }
            }
        }
        return min;
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
