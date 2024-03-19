class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int n = num;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        PerfectNumber perfectNumber = new PerfectNumber();

        int[] nums = {28, 7};
        for (int num : nums) {
            System.out.println("Is " + num + " a perfect number? " + perfectNumber.checkPerfectNumber(num));
        }
    }
}
