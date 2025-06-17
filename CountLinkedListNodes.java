import java.util.LinkedList;

public class CountLinkedListNodes {
    public static class Node{
        int data;
        Node next;
        Node(int a){  data = a; next = null; }
    }
    public  static int getCount(Node head) {
        int sz=0;
        Node temp=head;
        Node next;
        while (temp!=null&& temp.next!=null){
            temp=temp.next;
            sz++;
        }
        return sz;


        // code here
    }
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        l.addFirst(5);
        l.addFirst(4);
        l.addFirst(3);
        l.addFirst(2);
        l.addFirst(1);
        System.out.println(l);
       


    }
}
