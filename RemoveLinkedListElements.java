public class RemoveLinkedListElements {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val)
      {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }
  }
    public ListNode removeElements(ListNode head, int val) {
    ListNode dummy=new ListNode();
    dummy.next=head;
    ListNode current=dummy;
    while (current.next!=null){
        if (current.next.val == val) {
            current.next = current.next.next;}
        else {
            current=current.next;
        }
        }
    return dummy.next;
    }
    public static void main(String[] args) {

    }
}
