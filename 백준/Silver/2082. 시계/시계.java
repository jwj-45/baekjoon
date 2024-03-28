import java.io.*;
import java.util.*;

public class Main {

    public int checkNum(String[] num) {
        String[] zero  = {"###", "#.#", "#.#", "#.#", "###"};
        String[] one   = {"..#", "..#", "..#", "..#", "..#"};
        String[] two   = {"###", "..#", "###", "#..", "###"};
        String[] three = {"###", "..#", "###", "..#", "###"};
        String[] four  = {"#.#", "#.#", "###", "..#", "..#"};
        String[] five  = {"###", "#..", "###", "..#", "###"};
        String[] six   = {"###", "#..", "###", "#.#", "###"};
        String[] seven = {"###", "..#", "..#", "..#", "..#"};
        String[] eight = {"###", "#.#", "###", "#.#", "###"};
        String[] nine  = {"###", "#.#", "###", "..#", "###"};

        String[][] number = {zero, one, two, three, four, five, six, seven, eight, nine};

        boolean b = true;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                String tmp1 = num[j];
                String tmp2 = number[i][j];
                b = check(tmp1, tmp2);
                if (!b) {
                    break;
                }
            }
            if (b) {
                return i;
            }
        }
        return -1;
    }

    public boolean check(String tmp1, String tmp2) {
        for (int i = 0; i < 3; i++) {
            if (tmp2.charAt(i) == '.' && tmp1.charAt(i) == '#') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Main main = new Main();

        String[] h1 = new String[5];
        String[] h2 = new String[5];
        String[] m1 = new String[5];
        String[] m2 = new String[5];
        String[][] clock = {h1, h2, m1, m2};
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                clock[j][i] = st.nextToken();
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int check = main.checkNum(clock[i]);
            if (i == 2) {
                sb.append(":");
            }
            sb.append(check);
        }
        System.out.println(sb);
    }
}