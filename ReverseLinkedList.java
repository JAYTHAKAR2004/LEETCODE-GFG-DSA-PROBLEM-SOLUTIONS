import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode head;
    ListNode tail;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev=null;

        ListNode tail;
        ListNode curr=head;
        ListNode next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        return head=prev;




    }
    public static void PrintList(ListNode head){
        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(2);
        head.next=new ListNode(1);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(3);
        PrintList(head);
        PrintList(reverseList(head));

    }
}
