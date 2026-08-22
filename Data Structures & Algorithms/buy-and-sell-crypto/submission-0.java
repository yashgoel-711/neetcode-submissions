class Solution {
    public int maxProfit(int[] prices) {
        int currMin = Integer.MAX_VALUE ;
        int maxProfit = 0 ;

        for(int i = 0 ; i < prices.length ; i++) {
            int currProfit = prices[i] - currMin ;
            maxProfit = Math.max(maxProfit , currProfit) ;
            currMin = Math.min(currMin , prices[i]) ;
        }

        return maxProfit ;
    }
}