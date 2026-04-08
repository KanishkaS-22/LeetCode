// Last updated: 4/8/2026, 8:17:23 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
       Arrays.sort(nums);
       for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1]){
            return true;
        }
       }
       return false;
    }
}