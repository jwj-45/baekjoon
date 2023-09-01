import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Main main = new Main();

        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(),".");
            String name = st.nextToken();
            String extension = st.nextToken();
            map.put(extension, map.getOrDefault(extension, 0) + 1);
        }

        ArrayList<String> list = new ArrayList<>();
        for (String str : map.keySet()) {
            list.add(str);
        }
        Collections.sort(list);
        for (String str : list) {
            bw.write(str + " " + map.get(str));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
