public class ReverseDigits {
    public static int reverseDigits(int n) {
        int reverse = 0;  // Initialize outside the loop

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        return reverse;  // Return the reversed number
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(221));  // Output: 122
    }
}
