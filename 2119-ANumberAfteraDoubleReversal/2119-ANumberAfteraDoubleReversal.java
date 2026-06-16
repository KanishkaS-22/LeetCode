// Last updated: 6/16/2026, 11:50:34 AM
1class Solution {
2    public boolean isSameAfterReversals(int num) {
3       int t1=num;
4       int r1=0;
5       while(num>0){
6        int d=num%10;
7        r1=r1*10+d;
8        num=num/10;
9       }
10       int r2=0;
11       while(r1>0){
12        int d2=r1%10;
13        r2=r2*10+d2;
14        r1=r1/10;
15       }
16       return r2==t1;
17    }
18}