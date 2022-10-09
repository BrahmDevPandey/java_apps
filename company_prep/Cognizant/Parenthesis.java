import java.util.Scanner;

public class Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int combinations = (int) Math.pow(2, 2 * n);
        String pattern;
        char arr[] = { '\0', '(', ')' };

        // loop for n places
        for (int j = 1; j <= 2; j++) {
            for (int k = 1; k <= 2; k++) {
                for (int l = 1; l <= 2; l++) {
                    pattern = "" + arr[j] + arr[k] + arr[l];
                    System.out.println(pattern);
                }
            }
        }
    }
}