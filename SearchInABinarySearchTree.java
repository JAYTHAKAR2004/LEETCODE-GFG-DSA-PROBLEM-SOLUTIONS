public class SearchInABinarySearchTree {
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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root==null||root.val==val){
            return root;
        }
        return val< root.val?searchBST(root.left,val):searchBST(root.right,val);

    }
    public static void main(String[] args) {

    }
}
