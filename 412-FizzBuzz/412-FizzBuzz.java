// Last updated: 9/2/2026, 10:25:39 AM
1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int res=0;
4        for(int i=0;i<accounts.length;i++){
5            int t=0;
6            for(int j=0;j<accounts[i].length;j++){
7                t+=accounts[i][j];
8            }
9            res=Math.max(t,res);
10        }
11        return res;
12    }
13}