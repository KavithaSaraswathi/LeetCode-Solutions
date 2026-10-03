class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }
            int newprofit=prices[i]-buy;
            if(newprofit>profit){
                profit=newprofit;
            }
        }
        return profit;
    }
}