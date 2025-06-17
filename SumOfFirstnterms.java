public class SumOfFirstnterms {
   public static int sumOfSeries(int n) {
       int sum=0;
       for (int i=0;i<=n;i++){
           sum+=i*i*i;
       }
       return sum;

        // code here
    }

    public static void main(String[] args) {
        System.out.println(sumOfSeries(5));

    }
}
