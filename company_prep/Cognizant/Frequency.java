import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();

        // Read the array from the input
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create an array to store the frequencies of each element
        int[] frequencies = new int[100001];

        // Loop through the array and update the frequencies
        for (int i = 0; i < n; i++) {
            frequencies[arr[i]]++;
        }

        // Loop through the array again and find the smallest index
        // such that the frequency of the element at that index is
        // lesser than or equal to the frequency of the current element
        for (int i = 0; i < n; i++) {
            int minIndex = -1;
            for (int j = i + 1; j < n; j++) {
                if (frequencies[arr[j]] >= frequencies[arr[i]]) {
                    minIndex = j;
                    break;
                }
            }
            if (minIndex == -1) {
                System.out.print("-1 ");
            } else {
                // chnge this line
                System.out.print(minIndex + 1 + " ");
            }
        }
    }
}