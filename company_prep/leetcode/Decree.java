package leetcode;

import java.util.*;

class UserMainCode {
    public int decreeCompliant(int input1, String[] input2) {
        Stack<Character> s = new Stack<Character>();
        int count = 0;
        String str = "";
        int len;
        char ch;
        boolean flag = true;

        for (int i = 0; i < input1; i++) {
            str = input2[i];
            len = str.length();
            flag = true;

            if (!(str.charAt(0) == '.' && str.charAt(len - 1) == '-'))
                continue;
            for (int j = 0; j < len; j++) {
                ch = str.charAt(i);
                if (ch == '.') {
                    s.push(ch);
                } else if (ch == '-') {
                    if (!s.empty() && s.peek() == '.') {
                        s.pop();
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag == true && s.empty())
                count++;
        }
        return count;
        // throw new UnsupportedOperationException("decreeCompliant(int input1, String[]
        // input2)");
    }
}

public class Decree {
    public static void main(String args[]) {
        int n;
        String inputs[];
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        inputs = new String[n];

        for (int i = 0; i < n; i++) {
            inputs[i] = sc.nextLine();
        }
        UserMainCode u = new UserMainCode();
        System.out.println("The count of compliant messages is: " + u.decreeCompliant(n, inputs));
        sc.close();
    }
}