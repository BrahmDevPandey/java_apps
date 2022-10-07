import java.util.Scanner;

public class MinSquares {
    static int getMinSquares(int n) {
        if (n <= 3)
            return n;

        int res = n;
        for (int x = 1; x <= n; x++) {
            int temp = x * x;
            if (temp > n)
                break;
            else
                res = Math.min(res, 1 +
                        getMinSquares(n - temp));
        }
        return res;
    }

    public static void main(String args[]) {
        int n = (new Scanner(System.in)).nextInt();
        System.out.println(getMinSquares(n));
    }
}
