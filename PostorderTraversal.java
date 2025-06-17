import java.util.ArrayList;

public class PostorderTraversal {
    class Node {
        int data;
        Node left, right;
        Node(int item)    {
            data = item;
            left = right = null;
        }
    }
    ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer>result=new ArrayList<>();
        postorderhelper(root,result);
        return result;

        // Your code goes here
    }
    public static void postorderhelper(Node root,ArrayList<Integer>result){
        postorderhelper(root.left,result);
        postorderhelper(root.right,result);
        result.add(root.data);
    }
    public static void main(String[] args) {

    }
}
