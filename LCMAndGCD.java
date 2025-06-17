public class LCMAndGCD {
    public static int[] lcmAndGcd(int a, int b) {
int gcd=Gcd(a,b);
        int lcm=a*b/Gcd(a,b);

        int lcm1 = lcm;
        return new int[]{lcm, gcd};
        // code here
    }
    public static int Gcd(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        Gcd(b,a%b);
        if (b==0){
            return a;
        }
        return Gcd(a,b);
    }
    public static void main(String[] args) {
        lcmAndGcd(5,10);

    }
}
