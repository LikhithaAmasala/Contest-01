class SingleNumII {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }
}
public class Main {
    public static void main(String[] args) {
        SingleNumII solution = new SingleNumII();

        int[] nums1 = {2, 2, 3, 2};
        System.out.println("Single element in nums1: " + solution.singleNumber(nums1));

        int[] nums2 = {0, 1, 0, 1, 0, 1, 99};
        System.out.println("Single element in nums2: " + solution.singleNumber(nums2)); 
    }
}
