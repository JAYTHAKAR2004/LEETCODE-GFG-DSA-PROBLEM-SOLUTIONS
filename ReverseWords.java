public class ReverseWords {
    public String reverseWords(String s) {
       int i=s.length()-1;
       StringBuilder result=new StringBuilder();
       while (i>=0){
           while (i>=0 && s.charAt(i)==' '){
               i--;
           }
           if (i<0){
               break;
           }
           int j=i;
           while (i>=0 && s.charAt(i)!=' '){
               i--;
           }
           result.append(s.substring(i+1,j+1));
           result.append(" ");
       }
       return result.toString().trim();

    }
    public static void main(String[] args) {

    }
}
