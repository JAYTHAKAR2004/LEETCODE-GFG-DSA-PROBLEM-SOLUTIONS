import java.util.Arrays;

public class MedianOfAnArray {
    public static double findMedian(int[] arr) {
        Arrays.sort(arr);
        int n= arr.length;
        int median = 0;

        if (n % 2 != 0) {
            // Odd length: Return the middle element
            return arr[n / 2];
        } else {
            // Even length: Return average of the two middle elements
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }


        // Code here.
    }


    public static void main(String[] args) {
        int arr[]={90, 100, 78, 89, 67};
        findMedian(arr);
        System.out.println(findMedian(arr));

    }
}
