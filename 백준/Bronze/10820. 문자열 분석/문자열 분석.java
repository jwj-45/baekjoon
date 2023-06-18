import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (sc.hasNextLine()) {
            String arr = sc.nextLine();
            int isDigitCnt = 0;
            int isBlankCnt = 0;
            int isUpperCnt = 0;
            int isLowerCnt = 0;
            for (int j = 0; j < arr.length(); j++) {
                if (Character.isDigit(arr.charAt(j))) {
                    isDigitCnt++;
                } else if (arr.charAt(j) == ' ') {
                    isBlankCnt++;
                } else if (Character.isUpperCase(arr.charAt(j))) {
                    isUpperCnt++;
                } else if (Character.isLowerCase(arr.charAt(j))) {
                    isLowerCnt++;
                }
            }
            System.out.println(isLowerCnt + " " + isUpperCnt + " " + isDigitCnt + " " + isBlankCnt);
        }
        sc.close();
    }
}
