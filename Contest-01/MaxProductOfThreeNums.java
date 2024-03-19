class MaxProductOfThreeNums {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        int FirstMax = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;
        int ThirdMax = Integer.MIN_VALUE;
        int FirstMin = Integer.MAX_VALUE;
        int SecondMin = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > FirstMax) {
                ThirdMax = SecondMax;
                SecondMax = FirstMax;
                FirstMax = nums[i];
            } else if (nums[i] > SecondMax) {
                ThirdMax = SecondMax;
                SecondMax = nums[i];
            } else if (nums[i] > ThirdMax) {
                ThirdMax = nums[i];
            }
            
            if (nums[i] < FirstMin) {
                SecondMin = FirstMin;
                FirstMin = nums[i];
            } else if (nums[i] < SecondMin) {
                SecondMin = nums[i];
            }
        }
        
        return Math.max(FirstMax * SecondMax * ThirdMax, FirstMax * FirstMin * SecondMin);
    }

    public static void main(String[] args) {
        MaxProductOfThreeNums solution = new MaxProductOfThreeNums();

        int[] nums1 = {1, 2, 3};
        System.out.println("Max product for nums1: " + solution.maximumProduct(nums1));

        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Max product for nums2: " + solution.maximumProduct(nums2)); 

        int[] nums3 = {-1, -2, -3};
        System.out.println("Max product for nums3: " + solution.maximumProduct(nums3)); 
    }
}
