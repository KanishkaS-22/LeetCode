// Last updated: 4/8/2026, 8:16:28 PM
class Solution {
    public int arraySign(int[] nums) {
       int s=1;
       for(int n:nums){
        if(n==0){
            return 0;
        }
        if(n<0){
            s=-s;
        }
       } 
       return s;
    }
}