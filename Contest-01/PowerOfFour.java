public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        PowerOfFour solution = new PowerOfFour();

        // Test cases
        System.out.println(solution.isPowerOfFour(16)); 
        System.out.println(solution.isPowerOfFour(5));  
        System.out.println(solution.isPowerOfFour(1));  
    }
}
