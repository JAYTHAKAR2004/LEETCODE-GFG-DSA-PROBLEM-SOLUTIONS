import com.sun.source.tree.Tree;

public class DeleteNodeInABST {
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root.val<key){
            root.right=deleteNode(root.right,key);
        } else if (root.val>key) {
            root.left=deleteNode(root.left,key);

        }
        else {
            if (root.left==null && root.right==null){
                return root;
            }
            else if (root.left==null){
                return root.right;
            }
            else if (root.right==null){
                return root.left;
            }
            TreeNode IS=InorderSuccessor(root.right);
            root.val= IS.val;
            root.right=deleteNode(root.right, IS.val);
        }
        return root;



    }
    public static TreeNode InorderSuccessor(TreeNode root){
        while (root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {

    }
}
