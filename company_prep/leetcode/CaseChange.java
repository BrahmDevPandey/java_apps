import java.util.Scanner;

public class CaseChange {
    public static String StringChallenge(String str) {
        String res = "";
        int len = str.length();
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch >= 65 && ch <= 90) {
                ch += 32;
            } else if (ch >= 97 && ch <= 122) {
                ch -= 32;
            }
            res += (char) ch;
        }

        res += "vpwqy1iu7926";

        str = "";
        len = res.length();
        for (int i = 0; i < len; i++) {
            ch = res.charAt(i);
            if (i % 4 == 3) {
                ch = '_';
            }
            str += (char) ch;
        }
        return str;
    }

    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        System.out.println(StringChallenge(input));
    }
}