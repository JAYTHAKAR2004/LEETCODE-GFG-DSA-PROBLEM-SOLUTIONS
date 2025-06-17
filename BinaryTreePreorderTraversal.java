import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
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
    }public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>result=new ArrayList<>();
        preorderhelper(root,result);
        return result;


    }

    public static void preorderhelper(TreeNode root,List<Integer>result){
        if (root!=null){
            result.add(root.val);
            preorderhelper(root.left,result);
            preorderhelper(root.right,result);
        }

    }
    public static void main(String[] args) {

    }
}
