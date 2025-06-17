public class RemoveDuplicatesFromSortedList {
    public class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
            this.next=null;
        }
        public static ListNode head;
        public static ListNode tail;
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev=head;
        ListNode temp=prev.next;
        if (head==null){
            return head;
        }

        while (temp!=null){
            if (temp.val==prev.val){
                temp=temp.next;
                continue;
            }
            prev.next=temp;
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        return head;

    }
    public static void main(String[] args) {

    }
}
