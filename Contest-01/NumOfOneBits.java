public class NumOfOneBits {
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += (n & 1);
            n >>>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        NumOfOneBits solution = new NumOfOneBits();

        System.out.println(solution.hammingWeight(0b00000000000000000000000000001011)); // Output: 3
        System.out.println(solution.hammingWeight(0b00000000000000000000000010000000)); // Output: 1
        System.out.println(solution.hammingWeight(0b11111111111111111111111111111101)); // Output: 31
    }
}
