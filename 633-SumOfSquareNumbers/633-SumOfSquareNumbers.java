// Last updated: 8/13/2026, 10:17:16 AM
class Solution {
    public boolean judgeSquareSum(int c) {
        for(long i = 0; i * i <= c; i++) {
    long rem = c - i * i;
    long j = (long)Math.sqrt(rem);

    if(j * j == rem) {
        return true;
    }
}
return false;
    }
}