import java.util.HashMap;

class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        
        int maxLength = 0;
        int start = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (charIndexMap.containsKey(c)) {
                start = Math.max(start, charIndexMap.get(c) + 1);
            }
            charIndexMap.put(c, end); 
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

        String[] testCases = {"abcabcbb", "bbbbb", "pwwkew"};
        for (String testCase : testCases) {
            int result = solution.lengthOfLongestSubstring(testCase);
            System.out.println("Input: " + testCase + ", Output: " + result);
        }
    }
}
