import java.util.Stack;

public class ClearDigits {
    public String clearDigits(String s) {
        Stack<Character> c=new Stack<>();
        for (int i=0;i<s.length();i++) {
            char ch=s.charAt(i);

            if (Character.isDigit(ch)){
                if (!s.isEmpty()){
                    c.pop();
                }

            }
            else {
                c.push(ch);
            }


        }
        StringBuilder result=new StringBuilder();
        for (char ch :c){
            result.append(ch);

        }
        return result.toString();
    }
    public static void main(String[] args) {

    }
}
