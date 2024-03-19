import java.util.HashMap;
import java.util.Map;

class AnagramPalindrome {
    int isPossible(String S) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : S.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        int oddCount = 0;
        for (int count : charCount.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount <= 1 ? 1 : 0;
    }
}

public class Main {
    public static void main(String[] args) {
        AnagramPalindrome sol = new AnagramPalindrome();

        String S1 = "geeksogeeks";
        System.out.println("Output for \"" + S1 + "\": " + (sol.isPossible(S1) == 1 ? "Yes" : "No"));

        String S2 = "geeksforgeeks";
        System.out.println("Output for \"" + S2 + "\": " + (sol.isPossible(S2) == 1 ? "Yes" : "No"));
    }
}
