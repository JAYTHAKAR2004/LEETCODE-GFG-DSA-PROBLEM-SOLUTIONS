import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class BinaryTreeZigZagLevelOrderTraversal {
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<Integer>result=new ArrayList<>();
        if (root==null){
            return null;
        }
        Stack<TreeNode>s1=new Stack<>();
        Stack<TreeNode>s2=new Stack<>();
s1.push(root);
while (!s1.isEmpty() || !s2.isEmpty()){
    while (!s1.isEmpty()){
        TreeNode node=s1.pop();
        result.add(root.val);
        if (node.left!=null){
            s2.push(node.left);
        }
        if (node.right!=null){
            s2.push(node.right);
        }
    }

    while (!s2.isEmpty()){
        TreeNode node=s2.pop();
        result.add(root.val);
        if (node.right!=null){
           s1.push(node.left);
        }
        if (node.right!=null){
            s1.push(node.right);
        }
    }
}
return Collections.singletonList(result);

    }
    public static void main(String[] args) {

    }
}
