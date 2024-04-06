import java.io.*;
import java.util.*;

class Consult {
    private int day;
    private int pay;

    public Consult(int day, int pay) {
        this.day = day;
        this.pay = pay;
    }

    public int getDay() {
        return this.day;
    }

    public int getPay() {
        return this.pay;
    }
}

public class Main {

    private static Consult[] bj;
    private static int n, max = 0;

    public void dfs(int day, int sum) {
        if (day > n) {
            return;
        }
        for(int i = day; i <= n; i ++) {
            int nextD = bj[i].getDay() + i - 1;
            if(nextD <= n) {
                max = Math.max(max, sum + bj[i].getPay());
//            System.out.printf("cnt=%d || day=%d || nextD=%d || sum + bj[i].getPay()=%d || max=%d\n", cnt, i, nextD, sum + bj[i].getPay(), max);
                dfs(nextD + 1, sum + bj[i].getPay());
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        bj = new Consult[n + 1];

        for(int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int day = Integer.parseInt(st.nextToken());
            int pay = Integer.parseInt(st.nextToken());

            bj[i] = new Consult(day, pay);
        }

        Main main = new Main();
        main.dfs(1, 0);

        System.out.println(max);
    }
}