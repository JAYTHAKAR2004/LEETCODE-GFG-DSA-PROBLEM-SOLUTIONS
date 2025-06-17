import java.util.ArrayList;

public class InorderTraversal {
    class Node {
        int data;
        Node left, right;
        Node(int item)    {
            data = item;
            left = right = null;
        }
    }
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer>result=new ArrayList<>();
        inOrderHelper(root,result);

        return result;

    }

  public void inOrderHelper(Node root,ArrayList<Integer>result){
        if (root!=null){
            System.out.println(root.data+"");
            inOrderHelper(root.left,result);
            inOrderHelper(root.right,result);
        }
  }

    public static void main(String[] args) {

    }
}
