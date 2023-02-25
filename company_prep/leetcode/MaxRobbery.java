import java.util.*;

public class MaxRobbery {
    int nums[]; // instance variable to avoid passing array each time

    public int rob(int[] nums) {
        this.nums = nums;
        return Math.max(getRobbedMoney(0, 0), getRobbedMoney(1, 0));
    }

    int getRobbedMoney(int index, int sum) {
        if (index >= nums.length) {
            return sum;
        }

        return Math.max(getRobbedMoney(index + 2, sum + nums[index]), getRobbedMoney(index + 3, sum + nums[index]));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        MaxRobbery obj = new MaxRobbery();
        System.out.println(obj.rob(arr));
    }
}
