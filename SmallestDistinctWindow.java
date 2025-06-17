import java.util.*;

public class SmallestDistinctWindow {

    public static int findSubString(String str) {
        int n = str.length();
        Set<Character> distinctChars = new HashSet<>();
        for (char ch : str.toCharArray()) {
            distinctChars.add(ch);
        }
        int required = distinctChars.size(); // Total unique chars

        Map<Character, Integer> windowFreq = new HashMap<>();
        int start = 0, minLen = Integer.MAX_VALUE;
        int count = 0;

        for (int end = 0; end < n; end++) {
            char ch = str.charAt(end);
            windowFreq.put(ch, windowFreq.getOrDefault(ch, 0) + 1);

            // Count a character only the first time it appears in the window
            if (windowFreq.get(ch) == 1) {
                count++;
            }

            // Try to shrink the window
            while (count == required) {
                if (end - start + 1 < minLen) {
                    minLen = end - start + 1;
                }

                char startChar = str.charAt(start);
                windowFreq.put(startChar, windowFreq.get(startChar) - 1);
                if (windowFreq.get(startChar) == 0) {
                    count--;
                }
                start++;
            }
        }

        return minLen;
    }

    public static void main(String[] args) {
        String str1 = "aabcbcdbca";
        System.out.println(findSubString(str1)); // Output: 4

        String str2 = "aaab";
        System.out.println(findSubString(str2)); // Output: 2
    }
}
