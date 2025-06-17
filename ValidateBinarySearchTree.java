public class ValidateBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean isValidBST(TreeNode root) {

        if (root==null){
            return true;
        }

return Valid(root,null,null);
    }
    public boolean Valid(TreeNode root,TreeNode min,TreeNode max){
        if (root==null){
            return true;
        }
        else if (min!=null && root.val<=min.val){
            return false;
        } else if (max!=null && root.val>= max.val) {
            return false;

        }
        return Valid(root.left,min,root) && Valid(root.right,root,max);
    }
    public static void main(String[] args) {

    }
}
