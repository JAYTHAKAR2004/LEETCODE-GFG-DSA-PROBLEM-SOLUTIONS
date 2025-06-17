import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer>s=new Stack<>();
        while (!queue.isEmpty()){
            s.push(queue.remove());
        }
        while (!s.isEmpty()){
            queue.add(s.pop());
        }
        return queue;


    }
    public static void main(String[] args) {

    }
}
