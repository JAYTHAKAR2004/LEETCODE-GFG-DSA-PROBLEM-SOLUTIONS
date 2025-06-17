import java.util.*;

public class LevelOrderInSpiralForm {
    class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    public ArrayList<Integer> findSpiral(Node root) {
        ArrayList<Integer>result=new ArrayList<>();
      Stack<Node>s1=new Stack<>();
      Stack<Node>s2=new Stack<>();
      if (root==null){
         return result;
      }
      s1.push(root);
      while (!s1.isEmpty() || !s2.isEmpty()){
          while (!s1.isEmpty()){
              Node node=s1.pop();
              result.add(root.data);
              if (node.left!=null){
                  s2.push(node.left);
              }
              if (node.right!=null){
                  s2.push(node.right);
              }
          }
          while (!s2.isEmpty()){
              Node node=s2.pop();
              result.add(root.data);
              if (node.right!=null){
                  s1.push(node.right);
              }
              if (node.left!=null){
                  s1.push(node.left);
              }
          }
      }
      return result;


    }

    public static void main(String[] args) {

    }
}
