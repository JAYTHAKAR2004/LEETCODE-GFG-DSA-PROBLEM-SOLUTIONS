import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];

        // Merge both arrays
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);

        // Sort the merged array
        Arrays.sort(merged);

        System.out.println("Merged and Sorted: " + Arrays.toString(merged));

        int n = merged.length;
        if (n % 2 == 1) {
            return merged[n / 2]; // odd length
        } else {
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0; // even length
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median); // Output: 2.0
    }
}
