import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAStack {
    public static void insertAtBottom(Stack<Integer>s,int val){
        if (s.isEmpty()){
            s.push(val);
            return;
        }
        int temp=s.pop();
        insertAtBottom(s,val);
        s.push(temp);
    }
    public static void reverse(Stack<Integer>s){
        if (s.isEmpty()){
          return;
        }
        int top=s.pop();
        reverse(s);
        insertAtBottom(s,top);
    }

    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();

    }

