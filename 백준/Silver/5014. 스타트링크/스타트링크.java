import java.io.*;
import java.util.*;

public class Main {

    public int BFS(int F, int S, int G, int[] checkFloor, int[] nextFloor) {

        if (S == G) {
            return 0;
        }
        else {
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(S);
            checkFloor[S] = 1;
            int breadth = 0;

//            int len = queue.size();
//            for(int i = 0; i < len; i ++)

//            for(int t = 0; i < queue.size(); i++)
//            위 두개가 다른값이 나옴 why?

            while (!queue.isEmpty()) {
                int len = queue.size();
                for (int i = 0; i < len; i++) {
                    int currentF = queue.poll();
                    for (int j = 0; j < 2; j++) {
                        int nextF = currentF + nextFloor[j];
//                    System.out.println("j: " + j + " // nextF: " + nextF);
                        if (nextF == G) {
                            return breadth + 1;
                        }
                        else if (nextF > 0 && nextF < F + 1 && checkFloor[nextF] == 0) {
//                            System.out.println(nextF);
                            checkFloor[nextF] = 1;
                            queue.offer(nextF);
                        }
                    }
                }
//            System.out.println();
            breadth++;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Main main = new Main();

        int F = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int U = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int[] checkFloor = new int[F + 1];
        int[] nextFloor = {U, -D};

        int x = main.BFS(F, S, G, checkFloor, nextFloor);
        String result = "";

        if (x != -1) {
            result = String.valueOf(x);
        } else if (x == 0) {
            result = "0";
        } else {
            result = "use the stairs";
        }

        System.out.println(result);
    }
}