import java.util.ArrayList;

public class SameTree {
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null){
            return true;
        } else if (p==null || q==null) {
            return false;

        } else if (p.val!=q.val) {
            return false;

        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }


    public static void main(String[] args) {

    }
}
