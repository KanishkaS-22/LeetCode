// Last updated: 4/8/2026, 8:17:43 PM
class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int n:nums){
            res^=n;
        }
        return res;
    }
}