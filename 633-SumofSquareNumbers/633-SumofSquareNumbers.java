// Last updated: 6/2/2026, 4:14:27 PM
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        for(long i = 0; i * i <= c; i++) {
4    long rem = c - i * i;
5    long j = (long)Math.sqrt(rem);
6
7    if(j * j == rem) {
8        return true;
9    }
10}
11return false;
12    }
13}