import java.util.Arrays;

public class MinimumSumOfAbsoluteDifferencesOfPairs {
    long findMinSum(int[] A, int[] B, int N) {
        Arrays.sort(A);
        long minDiff=0;
        Arrays.sort(B);
        for (int i=0;i<A.length;i++){
            minDiff=Math.abs(A[i]-B[i]);
        }
        return minDiff;



    }
    public static void main(String[] args) {

    }
}
