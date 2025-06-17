import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer>s=new Stack<>();
        String operators="+*-/";
        for (String token:tokens){
            if (operators.indexOf(token)!=-1){
                int d2=s.pop();
                int d1=s.pop();
                int result=0;
                if (token.equals("+")){
                    result=d2+d1;
                } else if (token.equals("*")) {
                    result=d2*d1;

                } else if (token.equals("/")) {
                    result=d2/d1;

                } else if (token.equals("-")) {
                    result=d2-d1;

                }
                else {
                    s.push(Integer.valueOf(token));
                }
            }





        }
        return s.peek();

    }
    public static void main(String[] args) {

    }
}
