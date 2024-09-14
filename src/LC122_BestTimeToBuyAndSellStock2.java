public class LC122_BestTimeToBuyAndSellStock2 {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // If the current price is greater than the previous price,
            // then we add the difference to the maxProfit
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        LC122_BestTimeToBuyAndSellStock2 obj = new LC122_BestTimeToBuyAndSellStock2();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(obj.maxProfit(prices));
    }
}
