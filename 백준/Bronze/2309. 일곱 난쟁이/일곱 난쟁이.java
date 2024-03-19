import java.io.*;
import java.util.*;

public class Main {

    private static int[] combi;
    private static ArrayList<int[]> answer = new ArrayList<>();

    public void dfs(int idx, int stn, int sum, int[] dwarf) {

        if (idx == 7) {
            if (sum == 100) {
                int[] list = new int[7];
                for (int i = 0; i < 7; i++) {
                    list[i] = combi[i];
                }
                answer.add(list);
            }
        }
        else {
            for (int i = stn; i < 9; i++) {
                combi[idx] = i;
                dfs(idx + 1, i + 1, sum + dwarf[i], dwarf);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarf = new int[9];
        combi = new int[7];

        for(int i = 0; i < 9; i++) {
            dwarf[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(dwarf);
        Main main = new Main();
        main.dfs(0, 0, 0, dwarf);

        for (int x : answer.get(0)) {
            System.out.println(dwarf[x]);
        }
    }
}