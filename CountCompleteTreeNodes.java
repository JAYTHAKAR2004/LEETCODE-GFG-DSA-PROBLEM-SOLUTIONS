public class CountCompleteTreeNodes {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public int countNodes(TreeNode root) {

        if (root==null){
            return 0;
        }
        return 1+countNodes(root.left)+countNodes(root.right);


    }
    public static void main(String[] args) {

    }
}
