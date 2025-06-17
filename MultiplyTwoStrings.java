public class MultiplyTwoStrings {
    public String multiplyStrings(String s1, String s2) {
        if (s1.equals("0")|| s2.equals("0")){
            return "0";
        }
        int m=s1.length();
        int n=s2.length();
        int []pos=new int[m+n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
                int sum = mul + pos[i + j + 1];
                pos[i + j + 1] = sum % 10;
                pos[i + j] += sum / 10;
            }

        } StringBuilder result = new StringBuilder();
        for (int p : pos) {
            if (!(result.length() == 0 && p == 0)) {  // Skip leading zeros
                result.append(p);
            }
        }

        return result.toString();
        // code here.
    }
    public static void main(String[] args) {

    }
}
