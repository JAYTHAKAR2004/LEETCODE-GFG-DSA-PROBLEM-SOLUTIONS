import java.util.*;

public class BinaryTreeLevelOrderTraversal {
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currNode = q.poll();
                currentLevel.add(currNode.val);

                if (currNode.left != null) q.add(currNode.left);
                if (currNode.right != null) q.add(currNode.right);
            }

            result.add(currentLevel);
        }

        return result;
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal bt = new BinaryTreeLevelOrderTraversal();

        // Example tree:
        //        1
        //       / \
        //      2   3
        //     / \   \
        //    4   5   6

        TreeNode root = bt.new TreeNode(1);
        root.left = bt.new TreeNode(2);
        root.right = bt.new TreeNode(3);
        root.left.left = bt.new TreeNode(4);
        root.left.right = bt.new TreeNode(5);
        root.right.right = bt.new TreeNode(6);

        List<List<Integer>> result = bt.levelOrder(root);
        System.out.println(result); // Output: [[1], [2, 3], [4, 5, 6]]
    }
}
