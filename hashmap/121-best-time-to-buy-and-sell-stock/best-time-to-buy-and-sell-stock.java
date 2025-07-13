class Solution {
    public int maxProfit(int[] prices) {
        int buy_price = prices[0];
        
        int curr_pro = 0;
        int max_pro = 0;
        int n = prices.length;
        for(int i=1; i<n; i++){
            if(buy_price>prices[i]){
                buy_price = prices[i];
            }
            else{
            curr_pro = prices[i] - buy_price;
            max_pro = Math.max(curr_pro, max_pro);
            }
        }
        return max_pro;
    }
}