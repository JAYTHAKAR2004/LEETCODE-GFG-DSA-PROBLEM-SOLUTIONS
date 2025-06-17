public class ReverseaString1 {
    public static String reverseString(String s) {
        char[] c=s.toCharArray();
        int n=c.length;
        for (int i=0;i<n/2;i++){
            char temp=c[i];
            c[i]=c[n-1-i];
            c[n-1-i]=temp;
        }
        return new String(c);

        // code here
    }
    public static void main(String[] args) {
        System.out.println(reverseString("plhckq"));

    }
}
