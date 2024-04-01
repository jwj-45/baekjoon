import java.io.*;
import java.util.*;

public class Main {

    private static int[] combi, ch;
    private static int n;
    private static ArrayList<StringBuilder> answer = new ArrayList<>();

    public void dfs(int idx) {
        if(idx == n) {
            StringBuilder sb = new StringBuilder();
            for(int x : combi) {
                sb.append(x).append(" ");
            }
            answer.add(sb);
        }
        else {
            for(int i = 1; i <= n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    combi[idx] = i;
                    dfs(idx + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        combi = new int[n];
        ch = new int[n + 1];

        Main main = new Main();

        main.dfs(0);

        for (StringBuilder s : answer) {
            System.out.println(s);
        }
    }
}