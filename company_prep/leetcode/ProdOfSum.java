import java.util.Scanner;

public class ProdOfSum {
    static int ProductOfSums(int arr[], int n) {
        int sum1 = 0, sum2 = 0, i;
        for (i = 0; i < n - 1 && arr[i] < arr[i + 1]; i++) {
            sum1 += arr[i];
        }
        sum1 += arr[i];
        while (i < n) {
            sum2 += arr[i];
            i++;
        }
        return sum1 * sum2;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(ProductOfSums(arr, n));
    }
}
