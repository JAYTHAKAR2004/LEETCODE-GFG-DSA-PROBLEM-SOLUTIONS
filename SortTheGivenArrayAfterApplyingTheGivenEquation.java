import java.util.ArrayList;
import java.util.Collections;

public class SortTheGivenArrayAfterApplyingTheGivenEquation {
    public ArrayList<Integer> sortArray(int[] arr, int A, int B, int C) {
        // Code here

        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(n, 0));
        int i = 0, j = n - 1;
        int index = (A >= 0) ? n - 1 : 0;

        while (i <= j) {
            int val1 = calculate(arr[i], A, B, C);
            int val2 = calculate(arr[j], A, B, C);

            if (A >= 0) {
                if (val1 > val2) {
                    result.set(index--, val1);
                    i++;
                } else {
                    result.set(index--, val2);
                    j--;
                }
            } else {
                if (val1 < val2) {
                    result.set(index++, val1);
                    i++;
                } else {
                    result.set(index++, val2);
                    j--;
                }
            }
        }
        return result;
    }

    private int calculate(int x, int A, int B, int C) {
        return A * x * x + B * x + C;
    }
    public static void main(String[] args) {

    }
}
