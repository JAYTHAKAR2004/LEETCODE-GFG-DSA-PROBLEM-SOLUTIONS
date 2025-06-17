import java.util.Stack;

public class HistogramMaxRectangularArea {
    public static int getMaxArea(int arr[]) {
        int maxArea=0;
        int[] nsr=new int[arr.length];
        int[] nsl=new int[arr.length];
        Stack<Integer>s=new Stack<>();


        //Next smallest right
        for (int i=arr.length;i>=0;i--){
            while (!s.isEmpty()&&s.peek()>=arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nsr[i]=arr.length;
            }
            else {
                nsr[i]=s.peek();
                s.push(i);
            }
        }



        //Next smallest left

        for (int i=0;i<arr.length;i++){
            while (!s.isEmpty()&& s.peek()>= arr.length){
                s.pop();
            }
            if (s.isEmpty()){
            nsl[i]=-1;
            }
            else {
                nsl[i]=s.peek();
                s.push(i);
            }
        }

        //currArea

        for (int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(currArea,maxArea);
        }
        return maxArea;



    }
    public static void main(String[] args) {

    }
}
