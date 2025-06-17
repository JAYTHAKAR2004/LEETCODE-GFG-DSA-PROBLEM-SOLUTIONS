import java.util.Stack;

public class DeleteMidOfAStack {
    public void deleteMid(Stack<Integer> s) {
       s=new Stack<>();
       int size=s.size();
       int mid=size/2;
       delete(s,mid);
        // code here

    }
    public static void delete(Stack<Integer>s,int k){
        if (k==0){
            s.pop();
            return;
        }
        int temp=s.pop();
       delete(s,k-1);
       s.push(temp);


    }
    public static void main(String[] args) {

    }
}
