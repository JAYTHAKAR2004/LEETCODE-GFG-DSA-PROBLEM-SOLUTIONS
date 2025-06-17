public class KthSmallestNumberInMultiplicationTable {
    public int kthSmallest(int m, int n, int k) {
        int low=1;
        int high=m*n;
        while (low<high){
            int mid=(low+high)/2;
            int count=countless(mid,m,n);
            if (count<k){
                low=mid+1;
            }
            else {
                high=mid;
            }
        }
        return low;

}
    private int countless(int x, int m, int n) {
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += Math.min(n, x / i);
        }
        return count;
    }}
