public class SumOfNNumbers {
    public static int nSum(int n){
        int ans = 0;

        //Write your code here to calculate and return sum of n number.
        for(int i =0;i<=n;i++){
            ans+=i;
        }



        return ans;
    }

    public static void main(String[] args) {
        System.out.println(nSum(5));
    }
}
