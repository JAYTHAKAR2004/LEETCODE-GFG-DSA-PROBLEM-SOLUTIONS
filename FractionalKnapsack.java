import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public double fractionalKnapsack(int[] values, int[] weights, int W) {
        double ratio[][]=new double[values.length][2];
        int finalAns=0;
        for (int i=0;i< values.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=values[i]/(double)weights[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        int capacity=W;

        for (int i= ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if (capacity>=weights[idx]){
                finalAns+=values[idx];
                capacity-=weights[idx];
            }
            else {
                finalAns+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        return finalAns;
        // code here

    }
    public static void main(String[] args) {

    }
}
