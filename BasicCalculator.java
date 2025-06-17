public class BasicCalculator {

    public  static int calculate(String s) {
     int n=Integer.parseInt(s);
     return n;

    }
    public static void main(String[] args) {
       // calculate("1 + 1");
        System.out.println(calculate(String.valueOf(1 + 1)));
        
    }
}
