class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int min = prices[0];
        int profit = 0;

        //Finding min in the array
        for(int i = 1; i < n; i++)
        {
            if(prices[i] < min)
            {
                min = prices[i];
            }

            int currentProfit = prices[i] - min;

            if(currentProfit > profit)
            {
                profit = currentProfit;
            }
        }
        return profit;
    }
}