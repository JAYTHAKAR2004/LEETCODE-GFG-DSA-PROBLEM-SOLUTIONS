import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        Integer[] coinArr = Arrays.stream(coins).boxed().toArray(Integer[]::new);
        Arrays.sort(coinArr, Comparator.reverseOrder());
        int count=0;
        ArrayList<Integer>ans=new ArrayList<>();
        for (int i=0;i<coins.length;i++){
            if (coins[i]<=amount){
                while (coins[i]<amount){
                    count++;
                    ans.add(coins[i]);
                    amount-=coins[i];
                }
            }
        }
return count;
    }

    public static void main(String[] args) {

    }
}
