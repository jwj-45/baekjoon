import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> result = new Stack<>();

        StringBuilder sb = new StringBuilder();

        int start = 0;
        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp > start) {
                for (int j = start + 1; j <= tmp; j++) {
                    stack.add(j);
                    sb.append("+\n");
                    start = j;
                }
            }
            if (tmp <= start) {
                if (!stack.isEmpty() && tmp == stack.peek()) {
                    result.add(stack.pop());
                    sb.append("-\n");
                }
                else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.print(sb);
    }
}