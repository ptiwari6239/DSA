
//  leetcode question :- 121
public class BestTimetoBuyandSellStock
{
    public int maxProfit(int[] prices) {
        int buyStockPrices = prices[0];
        int Oldprofit = 0;
        for(int i = 1 ; i < prices.length; i++){
            if(prices[i] < buyStockPrices){
                buyStockPrices = prices[i];
//                buyStockIndex = i ;

            }
            if(prices[i] > buyStockPrices){
                int profit = prices[i] - buyStockPrices;
                if(Oldprofit < profit )
                    Oldprofit = profit;
//                profit = buyStockPrices - prices[i];
            }
            if(prices[i] < buyStockPrices){
                buyStockPrices = prices[i];
            }

        }




        return Oldprofit;

    }
}
