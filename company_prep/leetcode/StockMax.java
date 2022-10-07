public class StockMax {
    public static String ArrayChallenge(int[] arr) {
        int lsf = Integer.MAX_VALUE;
        int op = -1;
        int pist = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lsf) {
                lsf = arr[i];
            }
            pist = arr[i] - lsf;
            if (op < pist) {
                op = pist;
            }
        }
        StringBuilder res = new StringBuilder("" + (op == 0 ? -1 : op));
        StringBuilder token = new StringBuilder("ajlbhvdt72");
        return res.reverse() + ":" + token.reverse();
    }

    // Driver code
    public static void main(String[] args) {
        // int arr[] = { 44, 30, 24, 32, 35, 30, 40, 38, 15 };
        int arr[] = { 10, 9, 8, 2 };

        System.out.print(ArrayChallenge(arr));
    }
}