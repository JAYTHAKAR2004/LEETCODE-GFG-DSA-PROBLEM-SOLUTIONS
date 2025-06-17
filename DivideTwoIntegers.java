public class DivideTwoIntegers {
    public  static int divide(int dividend, int divisor) {
        int result=0;
        if (dividend==Integer.MIN_VALUE && divisor==-1){
            result=Integer.MAX_VALUE;
        }
        return result=dividend/divisor;


    }
    public static void main(String[] args) {
        System.out.println(divide(10,3));

    }
}
