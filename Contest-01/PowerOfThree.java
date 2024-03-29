public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        PowerOfThree solution = new PowerOfThree();

        int[] nums = {27, 0, -1};
        for (int n : nums) {
            System.out.println("Is " + n + " a power of three? " + solution.isPowerOfThree(n));
        }
    }
}
