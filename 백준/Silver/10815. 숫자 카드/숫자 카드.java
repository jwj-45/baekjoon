import java.util.*;

public class Main {

    public ArrayList<Integer> solution(int n, int m, int[] sang, int[] card) {

        ArrayList<Integer> answer = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : sang) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int y : card) {
            if (map.get(y) == null) {
                answer.add(0);
            } else {
                answer.add(1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main b = new Main();
        int n = sc.nextInt();
        int[] sang = new int[n];
        for (int i = 0; i < n; i++) {
            sang[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] card = new int[m];
        for (int i = 0; i < m; i++) {
            card[i] = sc.nextInt();
        }

        for (int x : b.solution(n, m, sang, card)) {
            System.out.print(x + " ");
        }
    }
}