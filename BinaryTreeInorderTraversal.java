import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeInorderTraversal {
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>result=new ArrayList<>();

      inorderhelper(root,result);


        return result;

    }
    public void inorderhelper(TreeNode root,List<Integer>result){
        if (root!=null){
           inorderhelper(root.left,result);
           result.add(root.val);
           inorderhelper(root.right,result);

        }
    }

    public static void main(String[] args) {

    }
}
