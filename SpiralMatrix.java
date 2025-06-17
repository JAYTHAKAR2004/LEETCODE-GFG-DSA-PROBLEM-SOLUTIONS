import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int sr = 0, sc = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;

        while (sr <= er && sc <= ec) {
            // Traverse from left to right
            for (int j = sc; j <= ec; j++) {
                result.add(matrix[sr][j]);
            }

            // Traverse from top to bottom
            for (int i = sr + 1; i <= er; i++) {
                result.add(matrix[i][ec]);
            }

            // Traverse from right to left
            if (sr < er) { // Avoid duplicate row traversal
                for (int j = ec - 1; j >= sc; j--) {
                    result.add(matrix[er][j]);
                }
            }

            // Traverse from bottom to top
            if (sc < ec) { // Avoid duplicate column traversal
                for (int i = er - 1; i > sr; i--) { // i > sr to prevent duplicate values
                    result.add(matrix[i][sc]);
                }
            }

            // Move to the next inner layer
            sr++;
            er--;
            sc++;
            ec--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        Solution sol = new Solution();
        List<Integer> output = sol.spiralOrder(mat);
        System.out.println(output);
    }
}
