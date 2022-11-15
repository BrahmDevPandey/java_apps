import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class StrRearrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(schoolAdmission(str));
    }

    static String schoolAdmission(String s) {
        int len = s.length();
        List<Integer> indices = new ArrayList<Integer>();
        List<String> words = new ArrayList<String>();
        String word = "";
        for (int i = 0; i < len; i++) {
            if (Character.isDigit(s.charAt(i))) {
                words.add(word);
                indices.add(Integer.parseInt("" + s.charAt(i)));
                word = ""; // reset word
            } else {
                word += s.charAt(i);
            }
        }

        // re-arranging logic
        len = words.size();
        String arr[] = new String[len];
        for (int i = 0; i < len; i++) {
            arr[indices.get(i) - 1] = words.get(i);
        }
        String res = "";
        for (int i = 0; i < len; i++) {
            res += arr[i] + " ";
        }
        return res;
    }
}
