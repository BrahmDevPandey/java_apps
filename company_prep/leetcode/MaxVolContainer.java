class Solver {
    public void maxArea(int[] height) {
        int max = 0;
        // using two pointer approach
        int left = 0, right = height.length - 1, area;
        while (left < right) {
            area = Math.min(height[left], height[right]) * (right - left);
            if (area > max)
                max = area;
            if (left >= right) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println(max);
    }
}

public class MaxVolContainer {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 3, 4, 5, 18, 17, 6 };
        (new Solver()).maxArea(arr);
    }
}
