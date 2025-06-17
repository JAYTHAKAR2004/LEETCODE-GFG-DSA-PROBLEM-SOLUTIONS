public class SortALinkedListOf0s1sAnd2s {
    class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data=data;
            this.next=null;
        }
        public static Node head;
        public static Node tail;
    }

    public static Node segregate(Node head) {
        int [] count={0,0,0};
        Node temp=head;
        while (temp!=null){
            count[temp.data]++;
            temp=temp.next;
        }
        temp=head;
        int i=0;

        while (temp!=null){
            if (count[i]==0){
                i++;
            }
            else {
                temp.data=i;
                count[i]--;
                temp=temp.next;

            }
        }
        return head;
        // code here

    }
    public static void main(String[] args) {

    }
}
