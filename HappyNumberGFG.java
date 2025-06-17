import java.util.HashSet;
import java.util.Set;

public class HappyNumberGFG {
    static int isHappy(int N) {
        Set<Integer>usedInteger=new HashSet<>();
        while (true){
            int sum=0;
            while (N!=0){
                sum+=Math.pow(N%10,2.0);
                N=N/10;

            }
            if (sum==1){
                return 1;
            }
            N=sum;
            if (usedInteger.contains(N)){
                return 0;
            }
            usedInteger.add(N);
        }

    }
    public static void main(String[] args) {

    }
}
