import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] num = br.readLine().toCharArray();
        Arrays.sort(num);

        StringBuilder answer = new StringBuilder();

        for (char c : num) {
            answer.append(c);
        }

        answer.reverse();
        System.out.println(answer);
    }
}