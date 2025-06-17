public class DeleteHeadOfLinkedList {
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
    public static Node deleteHead(Node head) {
       Node temp=head;
       if (temp==null){
           return null;
       }
      return temp.next;

    }
    public static void main(String[] args) {

    }
}
