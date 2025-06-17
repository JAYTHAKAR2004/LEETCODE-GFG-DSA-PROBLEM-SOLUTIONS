public class SecondLargest {
    public static int getSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1; // Not enough elements
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] test1 = {10, 10, 10};
        System.out.println(getSecondLargest(test1)); // Expected: -1

        int[] test2 = {10, 20, 30, 40};
        System.out.println(getSecondLargest(test2)); // Expected: 30

        int[] test3 = {50, 20, 50, 40, 10};
        System.out.println(getSecondLargest(test3)); // Expected: 40

        int[] test4 = {13817, 15695, 4474, 8356, 12695, 24341, 8839, 28059, 8337, 3532};
        System.out.println(getSecondLargest(test4)); // Expected: 24341

        int[] test5 = {10};
        System.out.println(getSecondLargest(test5)); // Expected: -1
    }
}
