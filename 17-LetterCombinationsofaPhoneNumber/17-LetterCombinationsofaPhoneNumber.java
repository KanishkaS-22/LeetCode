// Last updated: 6/1/2026, 5:14:47 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3      //  int b=prices[0];
4        int p=0;
5        for(int i=1;i<prices.length;i++){
6            if(prices[i]>prices[i-1]){
7              p+=prices[i]-prices[i-1];
8        }
9        }
10        return p;
11    }
12}