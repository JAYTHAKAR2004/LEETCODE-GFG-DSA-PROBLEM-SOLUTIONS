public class PowerOfANumber {
    public  static int reverseExponentiation(int n) {
        if (n <= 3) {
            double pow = Math.pow(n, n);
            int pow1 = (int) pow;
            return pow1;

        }
        return n;
    }
        public static void main(String[]args){
            System.out.println(reverseExponentiation(10));

        }
    }
