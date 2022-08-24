import java.util.Scanner;

public class ZigZag {
    public static void printZigZag(String str, int rows) {
        int len = str.length();

        for (int i = 0; i < rows; i++) {
            for (int j = i; j < len; j += rows) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int rows = sc.nextInt();
        printZigZag(str, rows);
        sc.close();
    }
}
