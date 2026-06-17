// Last updated: 6/17/2026, 12:05:03 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int b=prices[0];
4        int p=0;
5        for(int j=1;j<prices.length;j++){
6            if(prices[j]<b){
7                b=prices[j];
8            }else if(prices[j]-b>p){
9                p=prices[j]-b;
10            }
11        }
12        return p;
13    }
14}