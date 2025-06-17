public class PrimeList {



    class Node{
        int val;
        Node next;

        public Node(int val){
            this.val=val;
            this.next=null;
        }
        public static Node head;
        public static Node tail;

    }

    Node primeList(Node head) {
       Node temp=head;
       while (temp!=null){
           temp.val=findNearestPrime(temp.val);
           temp=temp.next;
       }
       return head;
    }
    private int findNearestPrime(int n) {
        if (n <= 1) return 2;

        int lower = n, upper = n;
        while (!isPrime(lower)) lower--;
        while (!isPrime(upper)) upper++;

        if (n - lower <= upper - n) return lower;
        else return upper;
    }

    private boolean isPrime(int n){
        if (n<=1)return false;
        if (n==2||n==3) return true;
        if (n%2==0 || n%3==0)return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
