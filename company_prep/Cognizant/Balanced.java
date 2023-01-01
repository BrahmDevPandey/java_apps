import java.util.Scanner;

public class Balanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the dimensions of the array
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Read the array from the input
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Check if the array is balanced
        boolean balanced = true;
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                int sum = 0;
                if (i > 0) {
                    sum += arr[i - 1][j];
                }
                if (i < n - 1) {
                    sum += arr[i + 1][j];
                }
                if (j > 0) {
                    sum += arr[i][j - 1];
                }
                if (j < m - 1) {
                    sum += arr[i][j + 1];
                }
                if (sum % 2 != 0) {
                    balanced = false;
                    break;
                }
            }
            if (!balanced) {
                break;
            }
        }

        // Print the result
        if (balanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}