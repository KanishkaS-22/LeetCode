// Last updated: 7/7/2026, 11:48:03 AM
1class Solution {
2    public long sumAndMultiply(int n) {
3        int t=0;
4        int m=0;
5        int x=1;
6        while(n>0){
7         int d=n%10;
8         if(d!=0){
9          m+=d*x;
10          t=t+d;
11          x*=10;
12         }
13         n/=10;
14        }
15    return (long) m*t;
16    }
17}
18