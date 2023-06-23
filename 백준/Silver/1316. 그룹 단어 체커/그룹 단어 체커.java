import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        boolean[] group = new boolean[n];
        Arrays.fill(group, true);
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
            String s = str[i];
            for (int j = 0; j < s.length(); j++) {
                for (int k = j + 1; k < s.length(); k++) {
                    if (s.charAt(j) == s.charAt(k)
                            && s.charAt(k) != s.charAt(k - 1)) {
                        group[i] = false;
                    }
                }
            }
            if (group[i] == true) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}