import java.util.*;

public class MaxSubstrings {
    public static int maxNumOfSubstrings(String s) {
        int[] last = new int[26];
        Arrays.fill(last, -1);

        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        List<int[]> partitions = new ArrayList<>();
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);
            if (i == end) {
                partitions.add(new int[]{start, end});
                start = i + 1;
            }
        }

        return partitions.size();
    }

    public static void main(String[] args) {
        System.out.println(maxNumOfSubstrings("acbbcc"));
        System.out.println(maxNumOfSubstrings("ababcbacadefegdehijhklij"));
        System.out.println(maxNumOfSubstrings("aaa"));
    }
}
