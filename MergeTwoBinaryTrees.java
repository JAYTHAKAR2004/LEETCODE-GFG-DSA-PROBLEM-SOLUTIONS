import java.util.ArrayList;

public class MergeTwoBinaryTrees {
    static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        public TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1==null){
            return null;
        }
        if (root2==null){
            return null;
        }
        TreeNode merged=new TreeNode(root1.val+ root2.val);
        merged.left=mergeTrees(root1.left,root2.left);
        merged.right=mergeTrees(root2.left,root2.right);
        return merged;

    }
    public static void main(String[] args) {

    }
}
