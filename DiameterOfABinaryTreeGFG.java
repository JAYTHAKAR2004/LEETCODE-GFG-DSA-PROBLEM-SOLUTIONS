public class DiameterOfABinaryTreeGFG {
    class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    int diameter(Node root) {
        if (root==null){
            return 0;
        }
        int lDiam=diameter(root.left);
        int rDiam=diameter(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        int selfDiam=lh+rh+1;
        return Math.max(selfDiam,Math.max(lDiam,rDiam));



    }
    public static int height(Node root){
        if (root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static void main(String[] args) {

    }
}
