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

        StringBuilder output = new StringBuilder(res);
        StringBuilder token = new StringBuilder("5jyps1lx3af");
        return output.reverse() + ":" + token.reverse();
    }
    // String temp = "";
    // str = "g9a7wcd6f";
    // len = res.length();
    // for (int i = 0; i < len; i++) {
    // ch = res.charAt(i);
    // if (str.contains("" + ch)) {
    // temp += "--" + ch + "--";
    // } else {
    // temp += ch;
    // }
    // }
    // return temp;
    // }

    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        System.out.println(StringChallenge(input));
    }
}
