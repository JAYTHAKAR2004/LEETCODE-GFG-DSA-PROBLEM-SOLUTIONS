public class RemoveNthNodeFromEndOfList {
    public static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
        public static ListNode head;
        public static ListNode tail;
    }
    public  static ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy=new ListNode(0);
    dummy.next=head;
    ListNode slow=head;
        ListNode fast=head;
        for (int i=0;i<=n;i++){
            fast=fast.next;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;

        }
        slow.next=slow.next.next;
return dummy.next;

    }
    public static void main(String[] args) {

    }
}
