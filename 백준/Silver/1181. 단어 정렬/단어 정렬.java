import java.io.*;
import java.util.*;

class Voca implements Comparable<Voca> {

    public String str;
    public Integer len;

    Voca(String str, int len) {
        this.str = str;
        this.len = len;
    }

    @Override
    public int compareTo(Voca voca) {
        if (this.len == voca.len) {
            return this.str.compareTo(voca.str);
        } else {
//            return Integer.compare(this.len, voca.len);
            return this.len.compareTo(voca.len);
        }
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Voca> list = new ArrayList<>();
        ArrayList<String> arr = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (!arr.contains(str)) {
                arr.add(str);
            }
        }

        for (String s : arr) {
            int len = s.length();
            list.add(new Voca(s, len));
        }

        Collections.sort(list);

        for (Voca voca : list) {
            System.out.println(voca.getStr());
        }
    }
}