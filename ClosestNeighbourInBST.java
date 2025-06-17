public class ClosestNeighbourInBST {
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public int findMaxFork(Node root, int k) {
        int res=-1;
        while (root!=null){
            if (root.data==k){
                return k;
            } else if (root.data<k) {
                res=root.data;
                root=root.right;

                
            }
            else {
                root=root.left;
            }
        }
        return res;

    }
    public static void main(String[] args) {

    }
}
