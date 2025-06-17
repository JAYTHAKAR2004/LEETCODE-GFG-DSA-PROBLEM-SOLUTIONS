public class StockBuyAndSellMax2TransactionsAllowed {

    public static int maxProfit(int[] prices) {
        if (prices==null||prices.length<2){
            return 0;
        }


        int [] profitLeft=new int[prices.length];
        int [] profitRight=new int[prices.length];

        //profitLeft
       int minPrice=prices[0];
       for (int i=1;i<prices.length;i++){
           minPrice=Math.min(minPrice,prices[i]);
           profitLeft[i] = Math.max(profitLeft[i - 1], prices[i] - minPrice);
       }

        //profitRight

        int maxPrice=prices[prices.length-1];
       for (int i=prices.length-2;i>0;i--){
           maxPrice=Math.max(maxPrice,prices[i]);
           profitRight[i]=Math.max(profitRight[i+1],maxPrice-prices[i]);
       }

       //combine
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int secondTransactionProfit = (i + 1 < prices.length) ? profitRight[i + 1] : 0;
            maxProfit = Math.max(maxProfit, profitLeft[i] + secondTransactionProfit);
        }
        return maxProfit;


        // code here

    }
    public static void main(String[] args) {
        int prices[]={10, 22, 5, 75, 65, 80};
        System.out.println(maxProfit(prices));

    }
}
