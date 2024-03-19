public class BinaryNumberWithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int prevBit = n & 1;
        
        while (n > 0) {
            n >>= 1;
            int currentBit = n & 1;
            if (currentBit == prevBit) {
                return false;
            }
            prevBit = currentBit;
        }
        
        return true;
    }

    public static void main(String[] args) {
        BinaryNumberWithAlternatingBits solution = new BinaryNumberWithAlternatingBits();

        int[] testCases = {5, 7, 11};
        for (int n : testCases) {
            System.out.println("Input: " + n + " | Output: " + solution.hasAlternatingBits(n));
        }
    }
}
