public class ValidPalindrome {
    public  static boolean isPalindrome(String s) {
        StringBuilder filtered=new StringBuilder();
        for (char c:s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                filtered.append(Character.toLowerCase(c));
            }
        }
        return filtered.toString().equals(filtered.reverse().toString());


    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
}
