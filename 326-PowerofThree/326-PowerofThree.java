// Last updated: 5/29/2026, 2:01:42 PM
1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if(n<=0){
4            return false;
5        }
6        while(n%3==0){
7            n=n/3;
8        }
9        if(n==1){
10            return true;
11        }
12        return false;
13    }
14}