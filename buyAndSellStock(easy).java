class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length ; 
        int maxProfit = 0;
        int buy = prices[0] ; 

        for(int i=1 ; i < n ; i++){
            if(prices[i] < buy){
                buy = prices[i] ; 
            } else {
                maxProfit = Math.max(maxProfit, prices[i]-buy) ; 
            }
        }
        return maxProfit ; 
    }
}