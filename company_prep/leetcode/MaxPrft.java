import java.util.Scanner;

public class MaxPrft {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxRight = Integer.MIN_VALUE;
        int profit = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
            }
            profit += (maxRight - arr[i]);
        }
        System.out.println(profit);
    }
}
