// Last updated: 8/13/2026, 10:19:57 AM
class Solution {
    public boolean search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }
}