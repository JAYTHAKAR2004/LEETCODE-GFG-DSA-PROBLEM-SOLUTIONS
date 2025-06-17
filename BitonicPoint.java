public class BitonicPoint {
    public static int findMaximum(int[] arr) {
        int n=arr.length-1;
        for (int i=0;i< n;i++){

            if (arr[i]>arr[i+1]){
                return arr[i];
            }

        }
        return arr[n-1];
        // code here

    }
    public static void main(String[] args) {

    }
}
