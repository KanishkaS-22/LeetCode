// Last updated: 6/3/2026, 1:47:17 PM
1class Solution {
2    public int divide(int dividend, int divisor) {
3        if(dividend==Integer.MIN_VALUE&&divisor==-1){
4            return Integer.MAX_VALUE;
5        }
6        int m=dividend/divisor;
7        return m;
8    }
9}