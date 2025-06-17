import java.util.ArrayList;

public class BalanceABinarySearchTree {
    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }


    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> inorderList = new ArrayList<>();
        GetInorder(root, inorderList);
        return createBST(inorderList, 0, inorderList.size() - 1);
    }


    public static void GetInorder(TreeNode root, ArrayList<Integer> result) {
        if (root == null) return;
        GetInorder(root.left, result);
        result.add(root.val);
        GetInorder(root.right, result);
    }

    public TreeNode createBST(ArrayList<Integer> list, int st, int end) {
        if (st > end) return null;

        int mid = (st + end) / 2;
        TreeNode node = new TreeNode(list.get(mid));

        node.left = createBST(list, st, mid - 1);
        node.right = createBST(list, mid + 1, end);

        return node;
    }

    public static void main(String[] args) {
    }
}
