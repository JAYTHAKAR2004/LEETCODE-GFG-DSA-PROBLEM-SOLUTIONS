public class ArmstrongNumbers {

    public static boolean armstrongNumber(int n) {

        int originalNum=n;
        int sum=0;
        int num=Integer.toString(n).length();
        while (n>0){
            int digit=n%10;
            sum+=Math.pow(digit,num);
            n/=10;
        }
        return sum==originalNum;
    }

    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));

    }
}
