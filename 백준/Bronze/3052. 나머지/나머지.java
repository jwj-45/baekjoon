import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[10];
        int[] remainder = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            remainder[i] = arr[i] % 42;
            map.put(remainder[i], map.getOrDefault(remainder[i], 0) + 1);
        }
        System.out.print(map.size());
    }
}