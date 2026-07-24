class Solution_Buy1 {
    public int maxProfit(int[] prices) {

        // Brute force 

        // if (prices.length <= 1) {
        //     return 0;
        // }
        // int buy = prices[0], sell = prices[1], profit = sell - buy;
        // for (int i = 1; i < prices.length; i++) {
        //     if (prices[i] < buy && i != prices.length) {
        //         for (int j = i + 1; j < prices.length; j++){
        //             int temp_buy = prices[i], temp_sell = prices[j], temp_profit = temp_sell - temp_buy;
        //             if (temp_profit > profit){
        //                 buy = temp_buy;
        //                 sell = temp_sell;
        //                 profit = temp_profit;
        //             }
        //         }
        //     } else if (prices[i] > sell) {
        //         sell = prices[i];
        //     }
        //     profit = sell - buy;
        // }
        // if (profit <= 0) {
        //     return 0;
        // } else {
        //     return (profit);
        // }

        // Optimal solution

        if (prices.length <= 1) {
            return 0;
        }
        int buy = prices[0], max_profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else {
                if (prices[i] - buy > max_profit) {
                    max_profit = prices[i] - buy;
                }
            }
        }
        return max_profit;
    }
}