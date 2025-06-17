public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num){
        double sqrt=Math.sqrt(num);
        int sqrt1=(int) sqrt;
       return sqrt1*sqrt1==num;

    }
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(14));
    }
}

