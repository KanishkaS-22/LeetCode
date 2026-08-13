// Last updated: 8/13/2026, 10:20:08 AM
class Solution {
    public int mySqrt(int x) {
        int i=0;
        while((long)i*i<=x){
            i++;
        }
        return i-1;
    }
}