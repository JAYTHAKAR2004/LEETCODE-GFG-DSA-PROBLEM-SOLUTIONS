public class PeakElement {
    public static int peakElement(int[] arr) {
        int n=arr.length;
        if (n==0){
            return 0;
        }
        for (int i=0;i<n;i++){
            if ((i == 0 || arr[i] > arr[i - 1]) && (i == n - 1 || arr[i] > arr[i + 1])){
                return i;
            }

        }
        return -1;
    }
    public static boolean NoOfPeakElements(int arr[]){
        int index=peakElement(arr);
        if (index==-1){
            return false;
        }
        if ((index == 0 || arr[index] > arr[index - 1]) &&
                (index == arr.length - 1 || arr[index] > arr[index + 1])) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={1, 2, 4, 5, 7, 8, 3};
        peakElement(arr);
        System.out.println(NoOfPeakElements(arr))  ;
    }
}
