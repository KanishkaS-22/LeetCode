// Last updated: 8/13/2026, 10:19:41 AM
class Solution {
    public int maxProfit(int[] prices) {
        int b=prices[0];
        int p=0;
        for(int j=1;j<prices.length;j++){
            if(prices[j]<b){
                b=prices[j];
            }else if(prices[j]-b>p){
                p=prices[j]-b;
            }
        }
        return p;
    }
}