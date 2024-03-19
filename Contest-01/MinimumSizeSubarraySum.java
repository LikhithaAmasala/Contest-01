class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left++];
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
public class Main {
    public static void main(String[] args) {
        MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();

        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int target1 = 7;
        System.out.println("Output 1: " + solution.minSubArrayLen(target1, nums1)); 

        int[] nums2 = {1, 4, 4};
        int target2 = 4;
        System.out.println("Output 2: " + solution.minSubArrayLen(target2, nums2)); 

        int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
        int target3 = 11;
        System.out.println("Output 3: " + solution.minSubArrayLen(target3, nums3)); 
    }
}
