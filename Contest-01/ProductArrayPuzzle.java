import java.util.Arrays;

class ProductArrayPuzzle {
    public static long[] productExceptSelf(int nums[], int n) {
        long[] result = new long[n];
        long leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }
        long rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 3, 5, 6, 2};
        int n1 = nums1.length;
        System.out.println(Arrays.toString(productExceptSelf(nums1, n1))); 

        int[] nums2 = {12, 0};
        int n2 = nums2.length;
        System.out.println(Arrays.toString(productExceptSelf(nums2, n2))); 
    }
}
