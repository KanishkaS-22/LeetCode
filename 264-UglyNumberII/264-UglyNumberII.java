// Last updated: 9/2/2026, 2:06:23 PM
1class Solution {
2    public int nthUglyNumber(int n) {
3        int[]dp=new int[n];
4        dp[0]=1;
5        int a=0;
6        int b=0;
7        int c=0;
8        for(int i=1;i<n;i++){
9            int x=dp[a]*2;
10            int y=dp[b]*3;
11            int z=dp[c]*5;
12            dp[i]=Math.min(x,Math.min(y,z));
13            if(dp[i]==x){
14                a++;
15            }
16            if(dp[i]==y){
17                b++;
18            }
19            if(dp[i]==z){
20                c++;
21            }
22        }
23        return dp[n-1];
24    }
25}