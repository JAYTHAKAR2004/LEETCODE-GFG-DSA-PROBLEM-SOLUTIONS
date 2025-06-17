public class FindLengthOfLoop {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }
        public static Node head;
        public static Node tail;
    }
    public int countNodesinLoop(Node head) {
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if (slow==fast){
            return countLoopLength(slow);
        }

return 0;
        // code here.
    }
    private static int countLoopLength(Node meetingPoint){
        Node temp=meetingPoint;
        int count=1;
        while (temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
