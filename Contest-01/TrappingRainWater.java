class TrappingRainWater {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int total = 0;
        int left = 0, right = n - 1;
        int left_max = 0, right_max = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= left_max) {
                    left_max = height[left];
                } else {
                    total += left_max - height[left];
                }
                left++;
            } else {
                if (height[right] >= right_max) {
                    right_max = height[right];
                } else {
                    total += right_max - height[right];
                }
                right--;
            }
        }

        return total;
    }
}
public class Main {
    public static void main(String[] args) {
        TrappingRainWater solution = new TrappingRainWater();

        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Output for height1: " + solution.trap(height1)); 

        int[] height2 = {4, 2, 0, 3, 2, 5};
        System.out.println("Output for height2: " + solution.trap(height2)); 
    }
}
