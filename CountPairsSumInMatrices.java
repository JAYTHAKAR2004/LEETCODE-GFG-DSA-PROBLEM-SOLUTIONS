import java.util.HashSet;
import java.util.Set;

public class CountPairsSumInMatrices {
    int countPairs(int[][] mat1, int[][] mat2, int x) {
        int n = mat1.length;
        Set<Integer> set = new HashSet<>();

        // Insert all elements of mat2 into the set
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                set.add(mat2[i][j]);
            }
        }

        int count = 0;
        // Check for each element in mat1 if x - element exists in mat2 (via set)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int complement = x - mat1[i][j];
                if (set.contains(complement)) {
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {

    }
}
