import java.util.*;

public class Main {

    public String convertNumToString(String s) {
        String[] convert1 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] convert2 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(convert2[i], convert1[i]);
        }
        return s;
    }
    public String convertStringToNum(String s) {
        String[] convert1 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] convert2 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(convert1[i], convert2[i]);
        }
        return s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main b = new Main();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m - n + 1];
        String[] str = new String[m - n + 1];

        for (int i = 0; i < m - n + 1; i++) {
            arr[i] = i + n;
            str[i] = b.convertNumToString(String.valueOf(arr[i]));
        }

        Arrays.sort(str);

        for (int i = 0; i < m - n + 1; i++) {
            if (i !=0 && i % 10 == 0) {
                System.out.println();
            }
            str[i] = b.convertStringToNum(str[i]);
            System.out.print(str[i] + " ");
        }
    }
}
