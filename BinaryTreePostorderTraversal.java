import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>result=new ArrayList<>();
        postorderhelper(root,result);
        return result;

    }
    public static void postorderhelper(TreeNode root,List<Integer>result){
        if (root!=null){
            postorderhelper(root.left,result);
            postorderhelper(root.right,result);
            result.add(root.val);
        }
    }
    public static void main(String[] args) {

    }
}
