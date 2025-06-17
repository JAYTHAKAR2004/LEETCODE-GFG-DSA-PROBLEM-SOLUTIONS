import java.util.Stack;

public class ValidParenthesisString {
    public boolean checkValidString(String s) {
       Stack<Integer>st=new Stack<>();
       int maxOpen=0;
       int minOpen=0;
       for (char ch:s.toCharArray()){
           if (ch=='('){
               maxOpen++;
               minOpen++;
           } else if (ch==')') {
               maxOpen--;
               minOpen--;

           }
           else{
               minOpen--;
               maxOpen++;
           }
           if (maxOpen<0)return false;
           if (minOpen<0)minOpen=0;
       }
       return minOpen==0;

    }
    public static void main(String[] args) {

    }
}
