import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int res = findMajority(arr);
        if (res != -1)
            System.out.println(res);
        else
            System.err.println("No majority element.");
    }

    static int findMajority(int nums[]) {
        int count = 1;
        if (nums.length == 1)
            return nums[0];

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                if (count > nums.length / 2)
                    return nums[i];
            }
        }
        return -1;
    }
}
