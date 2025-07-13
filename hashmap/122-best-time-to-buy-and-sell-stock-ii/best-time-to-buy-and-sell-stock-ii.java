class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        for(int i=0; i<prices.length-1; i++){
            if(prices[i]<prices[i+1]){
                maxPro += prices[i+1] - prices[i];
            }
        }
        return maxPro;
    }
}