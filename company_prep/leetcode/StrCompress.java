import java.util.Arrays;
import java.util.Scanner;

public class StrCompress {
    public static String StringChallenge(String str) {
        String res = "";
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        int len = arr.length;
        int count = 1;
        char prev = arr[0];
        char ch;

        for (int i = 1; i < len; i++) {
            ch = arr[i];
            if (prev == ch) {
                count++;
            } else {
                res += prev;
                res += count;
                count = 1;
            }
            prev = ch;
        }
        res += prev;
        res += count;
        return res;
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
