public class DiameterOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static int Height(TreeNode root ){
        if (root==null){
            return 0;
        }
        int lh=Height(root.left);
        int rh=Height(root.right);
        return Math.max(lh,rh)+1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null){
            return 0;
        }
        int ldiam=diameterOfBinaryTree(root.left);
        int rdian=diameterOfBinaryTree(root.right);
        int lh=Height(root.left);
        int rh=Height(root.right);
        int selfdiam=lh+rh+1;
        return Math.max(selfdiam,Math.max(ldiam,rdian));

    }
    public static void main(String[] args) {

    }
}
