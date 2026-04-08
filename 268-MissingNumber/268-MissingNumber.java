// Last updated: 4/8/2026, 8:17:04 PM
class Solution {
    public int missingNumber(int[] nums) {
        int res=nums.length;
        for(int i=0;i<nums.length;i++){
            res+=i-nums[i];
        }
        return res;
    }
}