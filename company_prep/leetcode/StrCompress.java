import java.util.Scanner;

public class StrCompress {
    public static String StringChallenge(String str) {
        String res = "";
        str += '.'; // sentinel character
        int len = str.length();
        int count = 1;
        char prev = str.charAt(0);
        char ch;

        for (int i = 1; i < len; i++) {
            ch = str.charAt(i);
            if (prev == ch) {
                count++;
            } else {
                res += count;
                res += prev;
                count = 1;
            }
            prev = ch;
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
