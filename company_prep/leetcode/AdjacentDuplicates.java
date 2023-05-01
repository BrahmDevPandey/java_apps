import java.util.Scanner;

class Solution {
    public String removeDuplicates(String s) {
        boolean flag = true;

        while (flag) {
            flag = false; // control on iterations of outer loop
            String res = ""; // resultant of each iteration
            s += '#'; // adding extra character at end
            char ch = s.charAt(0); // track of the current distinct character
            int count = 1; // track of count of the current character

            for (int i = 1; i < s.length(); i++) {
                if (ch != s.charAt(i)) {
                    if (count == 1)
                        res += ch; // append ch to the resultant string
                    ch = s.charAt(i); // update ch to the new character
                    count = 1;
                } else {
                    flag = true;
                    count++;
                }
            }
            s = res; // update s for the next step
        }
        return s;
    }
}

public class AdjacentDuplicates {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String res = (new Solution()).removeDuplicates(str);
        System.out.println(res);
    }
}