
import java.util.LinkedList;
import java.util.Queue;
public class MyStack{
   private static Queue<Integer>queue=new LinkedList<>();

    public static void push(int x) {

        queue.add(x);
        int size= queue.size();
        for (int i=0;i<size;i++){
            queue.add(queue.remove());
        }

    }

    public int pop() {
        if (queue.isEmpty())throw new RuntimeException("Stack is empty");
        return queue.remove();

    }

    public int top() {
        if (queue.isEmpty()) throw new RuntimeException("Stack is empty");
       return queue.peek();

    }

    public boolean empty() {
        return queue.isEmpty();

    }
    public static void main(String[] args) {

    }
}
