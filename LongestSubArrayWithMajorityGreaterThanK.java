import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithMajorityGreaterThanK {
    static int longestSubarray(int[] arr, int k) {
        int n=arr.length;
        int[] transformed = new int[n];
        for (int i = 0; i < n; i++) {
            transformed[i] = arr[i] > k ? 1 : -1;
        }
        Map<Integer, Integer> firstSeen = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += transformed[i];


            if (sum > 0) {
                maxLen = i + 1;
            }


            if (firstSeen.containsKey(sum - 1)) {
                maxLen = Math.max(maxLen, i - firstSeen.get(sum - 1));
            }


            firstSeen.putIfAbsent(sum, i);
        }

        return maxLen;

    }
}
