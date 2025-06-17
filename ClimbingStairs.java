public class ClimbingStairs {
    public  static int climbStairs(int n) {
        int result=0;
        if (n==1|| n==2){
            return n;
        }

        result=climbStairs(n-1)+climbStairs(n-2);
        return result;


    }
    public static void main(String[] args) {
        System.out.println(climbStairs(3));

    }
}
