public class SquareRoot {

  public static   int floorSqrt(int n) {
        double number=Math.sqrt(n);
        n=(int) number;
        return n;
        // Your code here
    }
    public static void main(String[] args) {
        System.out.println(floorSqrt(4));


    }
}
