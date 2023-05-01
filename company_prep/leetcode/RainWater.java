class MySol {
    public static int trap(int[] height) {
        int total = 0;
        int left = 0;
        int temp = 0;

        for (int right = 0; right < height.length - 1;) {
            if (height[right] > height[right + 1]) {
                int left1 = left;
                while (left < right) {
                    temp = Math.min(height[left1], height[right]) - height[left];
                    if (temp > 0) {
                        total += temp;
                    }
                    left++;
                }
            }
            right++;
        }
        return total;
    }
}

public class RainWater {
    public static void main(String[] args) {
        int arr[] = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int res = MySol.trap(arr);
        System.out.println(res);
    }
}
