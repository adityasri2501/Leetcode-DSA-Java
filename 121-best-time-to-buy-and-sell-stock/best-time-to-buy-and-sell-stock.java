class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1){
            return 0;
        }
        int buy = prices[0], max_profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] <= buy){
                buy = prices[i];
            } else {
                if(prices[i] - buy > max_profit){
                    max_profit = prices[i] - buy;
                }
            }
        }
        return max_profit;
    }
}