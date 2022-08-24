import java.util.Scanner;

public class Troops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println((new TroopsSolution()).solve(arr));
    }
}

class TroopsSolution {
    public int solve(int[] A) {
        int x = 1;
        int days = 0;
        int troops = 0;
        int n = A.length;
        int i, max, maxIndex = 0;

        while (n > 0) {
            // System.out.print(x + " " + days + " " + troops + " " + A[i] + "\t");
            troops += x;
            days++;

            max = 0;
            maxIndex = -1;
            for (i = 0; i < A.length; i++) {
                if (A[i] <= troops && A[i] > max) {
                    max = A[i];
                    maxIndex = i;
                }
            }

            if (maxIndex != -1 && troops >= A[maxIndex]) {
                // kill all troops
                troops = 0;
                // increment training number
                x++;
                // go to the next kingdom
                A[maxIndex] = Integer.MAX_VALUE;
                n--;
            }
        }
        return days;
    }
}
