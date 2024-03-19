class WaysToMakeFairArray {
    public int waysToMakeFair(int[] nums) {
        int n = nums.length;
        int[] prefixSumOdd = new int[n + 1]; 
        int[] prefixSumEven = new int[n + 1]; 

        for (int i = 0; i < n; i++) {
            prefixSumOdd[i + 1] = prefixSumOdd[i] + (i % 2 == 1 ? nums[i] : 0);
            prefixSumEven[i + 1] = prefixSumEven[i] + (i % 2 == 0 ? nums[i] : 0);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            int oddSumBefore = prefixSumOdd[i] + prefixSumEven[n] - prefixSumEven[i + 1];
            int evenSumBefore = prefixSumEven[i] + prefixSumOdd[n] - prefixSumOdd[i + 1];
            
            if (oddSumBefore == evenSumBefore) {
                count++;
            }
        }

        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        WaysToMakeFairArray solution = new WaysToMakeFairArray();

        int[] nums1 = {2, 1, 6, 4};
        System.out.println("Output for nums1: " + solution.waysToMakeFair(nums1));

        int[] nums2 = {1, 1, 1};
        System.out.println("Output for nums2: " + solution.waysToMakeFair(nums2)); 

        int[] nums3 = {1, 2, 3};
        System.out.println("Output for nums3: " + solution.waysToMakeFair(nums3)); 
    }
}
