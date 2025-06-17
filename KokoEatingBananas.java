public class KokoEatingBananas {
    public int kokoEat(int[] arr, int k) {
        int low = 1;
        int high = 0;
        for (int pile : arr) {
            high = Math.max(high, pile); // max value in arr
        }

        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canEatAll(arr, k, mid)) {
                result = mid;      // possible, try smaller s
                high = mid - 1;
            } else {
                low = mid + 1;     // too slow, try faster s
            }
        }

        return result;
    }

    private boolean canEatAll(int[] arr, int k, int s) {
        int hours = 0;
        for (int pile : arr) {
            hours += (pile + s - 1) / s; // ceil(pile / s)
        }
        return hours <= k;
    }
    public static void main(String[] args) {

    }
}
