// Last updated: 6/3/2026, 2:40:09 PM
1class Solution {
2    public int maxProduct(int n) {
3       int m1=0,m2=0;
4       while(n>0){
5        int d=n%10;
6        if(d>m1){
7            m2=m1;
8            m1=d;
9        }else if(d>m2){
10            m2=d;
11        }
12        n=n/10;
13       }
14       return m1*m2;
15    }
16}