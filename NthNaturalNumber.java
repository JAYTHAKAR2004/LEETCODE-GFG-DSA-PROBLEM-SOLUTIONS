public class NthNaturalNumber {
    public static long findNth(long n) {
        long ans=0;
        long base=1;
       while (n>0){
           long rem = n % 9;
           ans += rem * base;
           n /= 9;
           base *= 10;

       }
       return ans;
        // code here
    }
    public static void main(String[] args) {
        System.out.println(findNth(10));

    }
}
