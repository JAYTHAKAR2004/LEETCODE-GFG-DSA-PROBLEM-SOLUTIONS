import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
    class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static ArrayList<Integer> preorder(Node root) {
        List<Integer> result=new ArrayList<>();
        preorderhelper(root,result);
        return (ArrayList<Integer>) result;
        // write code here

    }
    public static void preorderhelper(Node root,List<Integer>result){
        if (root!=null){
            result.add(root.data);
            preorderhelper(root.left,result);
            preorderhelper(root.right,result);
        }
    }
    public static void main(String[] args) {


    }
}
