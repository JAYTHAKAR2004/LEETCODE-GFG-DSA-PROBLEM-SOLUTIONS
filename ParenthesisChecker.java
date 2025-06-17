import java.util.Stack;
public class ParenthesisChecker {
    public static boolean isBalanced(String s) {
        Stack<Character>st=new Stack<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if (st.isEmpty()){
                    return false;
                }
                if ((st.peek()=='(' && ch==')') || (st.peek()=='{' && ch=='}') || (st.peek()=='[' && ch==']')){
                    st.pop();
                }
                else {
                    return false;
                }
            }
            if (st.empty()){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
    }
}
