
import java.util.Scanner;

public class ButterflyPattern {

    static void printButterflyPattern(int n) {
        String str = "*";
        String revStr = "*";
        String spaces = "";

        // creating the spaces string
        for (int i = 1; i <= 2 * n - 3; i++)
            spaces += " ";

        // printing the upper half
        for (int i = 1; i <= n; i++) {
            System.out.println(str + spaces + revStr);
            // append a * each time
            str += "*";
            if (spaces.length() == 1)
                break; // break at the last row
            revStr += "*";
            // reduce space str
            spaces = spaces.substring(0, spaces.length() - 2);
        }

        // now print the mid row
        System.out.println(str + revStr);

        // reducing the string by one char
        str = str.substring(0, str.length() - 1);

        // printing the lower half
        for (int i = 1; i < n; i++) {
            System.out.println(str + spaces + revStr);
            // now reduce the two strings
            str = str.substring(0, str.length() - 1);
            revStr = revStr.substring(1, revStr.length());
            // increase the spaces
            spaces += "  ";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        printButterflyPattern(n);
    }
}