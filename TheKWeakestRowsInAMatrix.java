import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

public class TheKWeakestRowsInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        List<int[]> strengthList = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int soldiers = countSoldiers(mat[i]);
            strengthList.add(new int[]{soldiers, i});
        }

        Collections.sort(strengthList, (a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];
            else
                return a[1] - b[1];
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = strengthList.get(i)[1];
        }

        return result;
    }

    private int countSoldiers(int[] row) {
        int left = 0, right = row.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (row[mid] == 1)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}
