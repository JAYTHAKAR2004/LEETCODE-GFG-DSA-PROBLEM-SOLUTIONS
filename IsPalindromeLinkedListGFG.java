class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}

public class IsPalindromeLinkedListGFG {
    public  static boolean isPalindrome(Node head) {
        Node mid=FindMiddle(head);
        Node prev=null;
        Node curr=mid;
        Node next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        while (right!=null){
            if (left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;

        }
        return true;

        // Your code here
    }
    public static Node FindMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null || fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {

    }
}
