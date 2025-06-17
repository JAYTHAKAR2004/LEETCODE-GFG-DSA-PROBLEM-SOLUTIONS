public class SumOfFirstNNaturalNumbers {
    public static int sumOfNaturals(int n) {
        int temp=0;
        for (int i=1;i<=n;i++){
            temp+=i;
        }
        return temp;
        // code here
    }

    public static void main(String[] args) {
        System.out.println(sumOfNaturals(6));
    }

}
