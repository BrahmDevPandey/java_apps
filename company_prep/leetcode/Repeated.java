import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Repeated {
    public int[] findDuplicates(int input1, int[] input2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < input1; i++) {
            if (map.containsKey(input2[i])) {
                map.put(input2[i], map.get(input2[i]) + 1);
            } else {
                map.put(input2[i], 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                list.add(key);
            }
        }

        int res[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Repeated obj = new Repeated();
        int res[] = obj.findDuplicates(n, arr);
        for (int val : res) {
            System.out.print(val + " ");
        }
        System.err.println();
    }
}
