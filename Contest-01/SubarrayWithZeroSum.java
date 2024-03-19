class SubarrayWithZeroSum {
    static boolean findsum(int arr[], int n) {
        Set<Integer> set = new HashSet<>();
        int prefixSum = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            if (prefixSum == 0 || set.contains(prefixSum))
                return true;

            set.add(prefixSum);
        }

        return false;
    }
}

class Solution {
    public static void main(String[] args) {

        int[] arr1 = {4, 2, -3, 1, 6};
        int n1 = arr1.length;
        System.out.println(SubarrayWithZeroSum.findsum(arr1, n1)); 

        int[] arr2 = {4, 2, 0, 1, 6};
        int n2 = arr2.length;
        System.out.println(SubarrayWithZeroSum.findsum(arr2, n2)); 
    }
}
