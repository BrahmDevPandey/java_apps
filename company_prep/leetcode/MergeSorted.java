import java.util.Scanner;

public class MergeSorted {
    static void merge(int arr1[], int arr2[], int m, int n) {
        int i, j, k;
        int arr[] = new int[m + n];

        // initilize all pointers to zero
        i = 0;
        j = 0;
        k = 0;

        // do while there there are elements in both of the arrays
        while (i < m && j < n) {
            // if arr1's element is smaller, insert it into arr
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++; // increment arr1 pointer to next element
            } else {
                // otherwise arr2's element is smaller, so insert it into arr
                arr[k] = arr2[j];
                j++; // increment arr2 pointer to next element
            }
            k++; // arr pointer will get incremented in both the cases, so keep it out of if-else
        }

        // now if some elements are left in arr1, copy them
        while (i < m) {
            arr[k] = arr1[i];
            k++;
            i++;
        }

        // or, if some elements are left in arr2, copy them
        while (j < n) {
            arr[k] = arr2[j];
            k++;
            j++;
        }

        // print the final array
        for (i = 0; i < m + n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int arr1[] = new int[m + n];
        int arr2[] = new int[n];

        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();

        merge(arr1, arr2, m, n);
    }
}