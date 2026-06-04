// Last updated: 6/4/2026, 4:22:48 PM
1class Solution {
2    public boolean isUgly(int n) {
3        if(n<=0){
4            return false;
5        }
6    while(n%2==0){
7        n=n/2;
8    }
9    while(n%3==0){
10        n=n/3;
11    }
12    while(n%5==0){
13        n=n/5;
14    }
15    return n==1;
16    }
17}