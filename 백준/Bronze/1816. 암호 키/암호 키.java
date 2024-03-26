import java.io.*;
import java.util.*;

public class Main {

    public ArrayList<Integer> solution() {
        int[] arr = new int[1000001];
        ArrayList<Integer> prime = new ArrayList<>();
        for(int i = 2; i < 1000001; i++) {
            if(arr[i] == 0) {
                prime.add(i);
                for(int j = i; j < 1000001; j += i) {
                    arr[j] = 1;
                }
            }
        }
        return prime;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] num = new long[n];
        for (int i = 0; i < n; i++) {
            num[i] = Long.parseLong(br.readLine());
        }

        Main main = new Main();
        ArrayList<Integer> prime = main.solution();

        for(int i = 0; i < n; i++) {
            long s = num[i];
            String answer = "YES";
            for (int x : prime) {
                if (s % x == 0) {
                    answer = "NO";
                }
            }
            System.out.println(answer);
        }
    }
}