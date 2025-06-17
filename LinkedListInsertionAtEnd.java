public class LinkedListInsertionAtEnd {

    class Node{
        int val;
        Node next;

        public Node(int val){
            this.val=val;
            this.next=null;
        }
        public static Node head;
        public static Node tail;

    }

    Node insertAtEnd(Node head, int x) {
        Node newNode=new Node(x);
        if (head==null){
            return newNode;
        }
        Node temp=head;
        while (temp!=null &&temp.next!=null){
            temp=temp.next;


        }
        temp.next=newNode;
        return head;
        // code here

    }
    public static void main(String[] args) {

    }
}
