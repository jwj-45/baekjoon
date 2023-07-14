import java.io.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toUpperCase();

        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        char answer = ' ';
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : map.keySet()) {
            if (max == map.get(c)) {
                answer = '?';
            } else if(max < map.get(c)) {
                max = map.get(c);
                answer = c;
            }
        }
        bw.write(answer);

        bw.flush();
        bw.close();
        br.close();
    }
}
