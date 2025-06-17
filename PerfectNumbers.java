public class PerfectNumbers {
    public static boolean isPerfectNumber(int n) {
        int sum_factors=1;
        if (n<2){
            return false;

        }
        for (int i=2;i*i<=n;i++){
            if (n%i==0){
                sum_factors+=i;
               // return true;
            }
        }
        return sum_factors==n;
        // code here
    }
    public static void main(String[] args) {
        isPerfectNumber(11);
        System.out.println(isPerfectNumber(6));

    }
}
