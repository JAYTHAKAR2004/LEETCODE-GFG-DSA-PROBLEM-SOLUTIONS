public class IsLinkedListLengthEven {
    public boolean isLengthEven(Node head) {
        int sz=0;
        Node temp=head;
        while (temp!=null){
            temp=temp.next;
            sz++;        }
        if (sz%2==0){
            return true;
        }
        return false;
        // code here
    }
    public static void main(String[] args) {

    }
}
