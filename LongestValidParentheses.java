import java.util.Stack;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        int count=0;
        Stack<Integer>c=new Stack<>();
        c.push(-1);
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if (ch=='('){
                c.push(i);
            }
            else {
                c.pop();
            }
            if (c.isEmpty()){
                c.push(i);

            }
            else {
                count=Math.max(count,i-c.peek());
            }



            }


        return count;

    }

    public static void main(String[] args) {
        String s=")()())";
        System.out.println(longestValidParentheses(s));

    }
}
