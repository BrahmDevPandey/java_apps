import java.io.*;
import java.util.Scanner;

public class Bleak {

    /*
     * Function to get no of set bits in binary
     * representation of passed binary no.
     */
    int countSetBits(int x) {
        int count = 0;
        while (x != 0) {
            x &= (x - 1);
            count++;
        }
        return count;
    }

    // Returns true if n is Bleak
    public String[] bleakNumbers(int input1, int[] input2) {
        // Check for all numbers 'x' smaller
        // than n. If x + countSetBits(x)
        // becomes n, then n can't be Bleak
        boolean flag = true;
        String res[] = new String[input1];
        for (int i = 0; i < input2.length; i++) {
            flag = true;
            for (int x = 1; x < input2[i]; x++) {
                if (x + countSetBits(x) == input2[i]) {
                    res[i] = "SUPPORTED";
                    flag = false;
                }
            }
            if (flag)
                res[i] = "BLEAK";
        }
        return res;
    }

    // Driver code
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Bleak obj = new Bleak();
        String res[] = obj.bleakNumbers(n, arr);
        for (String val : res) {
            System.out.print(val + "");
        }
    }
}