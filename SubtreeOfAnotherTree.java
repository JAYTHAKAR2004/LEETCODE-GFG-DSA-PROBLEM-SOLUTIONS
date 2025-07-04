import com.sun.source.tree.Tree;

public class SubtreeOfAnotherTree {

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

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root==null){
            return false;
        }
        if (root.val==subRoot.val){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        boolean leftAns=isSubtree(root.left,subRoot);
        boolean rightAns=isSubtree(root.right,subRoot);
        return leftAns||rightAns;

    }
    public static boolean isIdentical(TreeNode root,TreeNode subRoot){
        if (root==null && subRoot==null){
            return true;
        } else if (root == null || subRoot == null || root.val!= subRoot.val) {
            return false;

        }
        if (!isIdentical(root.left,subRoot.left)){
            return false;
        }
        if (!isIdentical(root.right,subRoot.right)){
            return false;
        }
        return true;


    }
    public static void main(String[] args) {

    }
}
