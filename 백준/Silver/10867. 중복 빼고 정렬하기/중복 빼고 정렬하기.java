import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int idx = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(idx)) {
                    idx = j;
                }
            }
            int tmp = list.get(i);
            list.set(i, list.get(idx));
            list.set(idx, tmp);
        }

        for (int x : list) {
            System.out.print(x + " ");
        }

    }
}
