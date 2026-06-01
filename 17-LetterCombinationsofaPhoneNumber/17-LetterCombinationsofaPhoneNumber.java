// Last updated: 6/1/2026, 4:25:14 PM
1class Solution {
2    public int mySqrt(int x) {
3        int i=0;
4        while((long)i*i<=x){
5            i++;
6        }
7        return i-1;
8    }
9}