public class Palindrome {
    public static boolean isPalindrome(int n) {

        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n% 10;
            reversed = reversed * 10 + digit;
            n /= 10;}
        return original==reversed;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(555));

    }
}
