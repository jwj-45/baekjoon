import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        ArrayList<Integer> cat = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            cat.add(k);
        }
        int day = 0;
        int idx = 0;
        while(!cat.contains(0)) {
            day++;
            if(idx >= n) {
                idx = 0;
            }
            for(int i = 0; i < n; i++) {
                cat.set(i, cat.get(i) - 1);
            }
            for(int i = idx; i < idx + a; i++){
                cat.set(i, cat.get(i) + b);
            }
            idx += a;
        }
        System.out.println(day);
    }
}