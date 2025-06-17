import com.sun.source.tree.Tree;

public class SymmetricTree {
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
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;       // Both are null
        if (left == null || right == null) return false;      // One is null

        // Values must be equal, and subtrees must be mirror images
        return (left.val == right.val) &&
                isMirror(left.left, right.right) &&
                isMirror(left.right, right.left);
    }
    public static void main(String[] args) {

    }

    }


