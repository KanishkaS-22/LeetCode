// Last updated: 7/1/2026, 3:06:01 PM
1class Solution {
2    public int climbStairs(int n) {
3       if(n<=2){
4        return n;
5       }
6       int[]dp=new int[n+1];
7       dp[1]=1;
8       dp[2]=2;
9       for(int i=3;i<=n;i++){
10        dp[i]=dp[i-1]+dp[i-2];
11       }
12       return dp[n];
13    }
14}