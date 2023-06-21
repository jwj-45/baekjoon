import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'
                        ,'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'
                        ,'q', 'r', 's', 't', 'u', 'v', 'w', 'x'
                        ,'y', 'z'};
        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch[i]) {
                    arr[i] = s.indexOf(s.charAt(j));
                    break;
                }
            }
        }
        
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}