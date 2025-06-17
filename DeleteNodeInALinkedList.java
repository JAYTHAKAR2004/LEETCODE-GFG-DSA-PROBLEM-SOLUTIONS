public class DeleteNodeInALinkedList {

    class ListNode{
        int val;
        ListNode next;
        public  ListNode(int data){
            this.val=val;
            this.next=null;

        }
        public static ListNode head;
        public static ListNode tail;
    }
    public ListNode deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;

return node;



    }

    public static void main(String[] args) {

    }
}
