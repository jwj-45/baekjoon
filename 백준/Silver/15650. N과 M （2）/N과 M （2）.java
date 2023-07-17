import java.util.Scanner;

public class Main {

    static int n, m;
    static int[] combi;

    public void DFS(int cnt, int start) {
        if (cnt == m) {
            for (int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else {
            for (int i = start; i <= n; i++) {
                combi[cnt] = i;
                DFS(cnt + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main main = new Main();

        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];

        main.DFS(0, 1);
    }
}
