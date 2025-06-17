public class ReverseAString {
    public static String revStr(String s) {
        char[] charArray = s.toCharArray();
       int n=charArray.length;
        for (int i=0;i<n/2;i++){
            char temp=charArray[i];
            charArray[i]=charArray[n-1-i];
            charArray[n-1-i]=temp;



        }
        return new String(charArray);
        // code here
    }

    public static void main(String[] args) {
        System.out.println(revStr("GeeksforGeeks"));

    }
}
