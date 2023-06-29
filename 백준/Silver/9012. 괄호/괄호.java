import java.util.*;

public class Main {

    public String[] solution(int n, String[] arr) {

        Stack<Character> st = new Stack<>();
        String[] answer = new String[n];
        Arrays.fill(answer, "YES");

        for (int i = 0; i < n; i++) {
            String str = arr[i];
            st.clear();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    st.push(str.charAt(j));
                } else {
                    if (st.isEmpty()) {
                        answer[i] = "NO";
                        break;
                    }
                    st.pop();
                }
            }
            if (!st.isEmpty()) {
                answer[i] = "NO";
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main b = new Main();
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (String x : b.solution(n, arr)) {
            System.out.println(x);
        }
    }
}