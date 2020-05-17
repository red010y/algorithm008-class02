package BestTimetoBuyandSellStockII122;

/**
 * A+B+C 的和等于差值 DD 所对应的连续峰和谷的高度之差。
 */
public class OneForeach {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }

}
