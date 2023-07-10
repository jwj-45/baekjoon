import java.io.*;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp != 0) {
                stack.push(tmp);
            } else {
                stack.pop();
            } 
        }
        int sum = 0;
        for (int x : stack) {
            sum += x; 
        }
        bw.write(String.valueOf(sum));
        bw.flush();

        bw.close();
        br.close();
    }
}
