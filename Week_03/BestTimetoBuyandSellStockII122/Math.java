package BestTimetoBuyandSellStockII122;

/**
 * 关键是我们需要考虑到紧跟谷的每一个峰值以最大化利润。
 * 如果我们试图跳过其中一个峰值来获取更多利润，
 * 那么我们最终将失去其中一笔交易中获得的利润，从而导致总利润的降低。
 */
public class Math {
    public int maxProfit(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }
}
