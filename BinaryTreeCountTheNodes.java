public class BinaryTreeCountTheNodes {
    static class Node{
        int data;
       Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public Node buildTree(int []nodes){
            idx++;
            if (nodes.length<=idx ||nodes[idx]==-1){
                return null;
            }
            Node nexNode=new Node(nodes[idx]);
            nexNode.left=buildTree(nodes);
            nexNode.right=buildTree(nodes);
            return nexNode;

        }
        public static int CountTheNodes(Node root){
            if (root==null){
                return 0;
            }
            int left=CountTheNodes(root.left);
            int right=CountTheNodes(root.right);
            return left+right+1;
        }
    public static void main(String[] args) {

    }
}}
