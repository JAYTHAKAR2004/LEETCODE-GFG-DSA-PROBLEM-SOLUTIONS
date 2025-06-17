import java.util.Stack;

public class LargestRectangleInHistogram {
    public static int largestRectangleArea(int[] heights) {

        int maxArea=0;
        int[] nsl=new int[heights.length];
        int[] nsr=new int[heights.length];


        //next smaller right


            Stack<Integer>s=new Stack<>();
        for (int i= heights.length;i>=0;i--){
            while (!s.isEmpty() && s.peek()>=heights[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nsr[i]= heights.length;
            }
            else {
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //next smaller right

            s=new Stack<>();
        for (int i=0;i<heights.length;i++){
            while (!s.isEmpty() && s.peek()>=heights[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nsl[i]= -1;
            }
            else {
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //curr max
       for (int i=0;i<heights.length;i++){
           int height=heights[i];
           int width=nsr[i]-nsl[i]-1;
           int currMax=height*width;
           maxArea=Math.max(currMax,maxArea);

       }
       return maxArea;




    }
    public static void main(String[] args) {
        int [] heights={2,1,5,6,2,3};

        System.out.println(largestRectangleArea(heights));

    }
}
