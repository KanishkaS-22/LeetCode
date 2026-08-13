// Last updated: 8/13/2026, 10:18:41 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        while(n%2==0){
            n=n/2;
        }
        if(n==1){
            return true;
        }
        return false;
    }
}