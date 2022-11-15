import java.util.Scanner;

public class MPattern {

    static void printMPattern(int n) {
        String str = "";
        String revStr = "";
        // creating the initial Strings
        for (int i = 0; i < n; i++) {
            str = str + (char) (65 + i);
            revStr = (char) (65 + i) + revStr;
        }
        // make reverse string one Character smaller
        revStr = revStr.substring(1, revStr.length());

        // the first row
        System.out.println(str + revStr);
        String spaces = " ";
        str = str.substring(0, str.length() - 1); // remove last char from str

        // now print the pattern
        for (int i = 1; i < n; i++) {
            System.out.println(str + spaces + revStr);
            str = str.substring(0, str.length() - 1);
            revStr = revStr.substring(1, revStr.length());
            spaces += "  ";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        printMPattern(n);
    }
}