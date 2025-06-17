import java.util.Stack;

public class SortAStack {
    public Stack<Integer> sort(Stack<Integer> s) {
        if (!s.isEmpty()){
            int top=s.pop();
            sort(s);
            insertInSortedOrder(s,top);
        }

return s;
    }

    private void insertInSortedOrder(Stack<Integer> s, int x) {
        if (s.isEmpty() ||s.peek()<x){
            s.push(x);

        }
        else {
            int temp=s.pop();
            insertInSortedOrder(s,x);
            s.push(temp);
        }

    }

    public static void main(String[] args) {

    }
}
