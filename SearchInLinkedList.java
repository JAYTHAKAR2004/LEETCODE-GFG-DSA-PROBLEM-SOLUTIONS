import java.util.LinkedList;

public class SearchInLinkedList {
    public static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data=data;
            this.next=null;
        }
        public static Node head;
        public static Node tail;

    }
    public static boolean searchLinkedList(Node head, int x) {
        Node temp=head;
        while (temp!=null ){
            if (temp.data==x){
                return true;
            }
            temp=temp.next;

        }
        return false;

        // Your code here

    }
    public static void main(String[] args) {
        LinkedList<Integer>l=new LinkedList<>();
        l.addFirst(5);
        l.addFirst(4);
        l.addFirst(3);
        l.addFirst(2);
        l.addFirst(1);
        System.out.println(searchLinkedList(Node.head,4));

    }
}
