import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthOfPairChain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        int chainLen=1;
        int PairEnd=pairs[0][1];
        for (int i=1;i< pairs.length;i++){
            if (pairs[i][0]>PairEnd){
                chainLen++;
                PairEnd=pairs[i][1];
            }
        }
        return chainLen;

    }
    public static void main(String[] args) {

    }
}
