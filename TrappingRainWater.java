public class TrappingRainWater {
    public static int trap(int[] height) {
        int []leftMax=new int[height.length];
        leftMax[0]=height[0];
        for (int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        int [] RightMax=new int[height.length];
        RightMax[height.length-1]=height[height.length-1];
        for (int j=height.length-2;j>=0;j--){
            RightMax[j]=Math.max(height[j],RightMax[j+1]);
        }
        int trappedWater=0;
        for (int i=0;i<height.length;i++){
            int waterLevel=Math.min(leftMax[i],RightMax[i]);
            trappedWater+=waterLevel-height[i];
        }
        return trappedWater;

    }
    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};


        System.out.println(trap(height));
    }
}
