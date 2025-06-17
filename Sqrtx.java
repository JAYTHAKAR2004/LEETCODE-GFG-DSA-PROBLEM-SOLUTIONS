public class Sqrtx {
    public static int mySqrt(int x){
        double sqrt=Math.sqrt(x);
        int num=(int) sqrt;
        return num;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(8));


    }
}
