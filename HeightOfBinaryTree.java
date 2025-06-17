import javax.swing.*;

public class HeightOfBinaryTree {
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
    int height(Node node) {
        if (node==null){
            return 0;
        }

       int lh=height(node.left);
       int rh=height(node.right);
       return Math.max(lh,rh)+1;

    }
    public static void main(String[] args) {

    }
}
