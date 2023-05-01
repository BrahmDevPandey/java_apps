import java.util.*;

public class CamelCase {

    // Function to remove spaces and StringChallenge
    // into camel case
    static String modify_variableName(String input1) {

        String res = "";
        char c;
        int n = input1.length();
        // to count spaces
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            c = input1.charAt(i);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                res += c;
            } else {
                cnt++;
                res += '_';
            }
        }
        input1 = res;

        System.out.println(input1);
        char ch[] = input1.toCharArray();
        int res_ind = 0;
        ch[0] = Character.toLowerCase(ch[0]);

        for (int i = 0; i < n; i++) {

            // check for spaces in the sentence
            if (ch[i] == '_') {
                // conversion of next into upper case
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);
                for (int j = i + 2; j < n && ch[j] != '_'; j++) {
                    ch[j] = Character.toLowerCase(ch[j]);
                }
            }

            // If not space, copy character
            else
                ch[res_ind++] = ch[i];
        }

        // new string will be reduced by the
        // size of spaces in the original string
        String output = String.valueOf(ch, 0, n - cnt);
        return output;
    }

    // Driver code
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "I get intern at geeksforgeeks";
        str = sc.nextLine();
        System.out.println(modify_variableName(str));
    }
}