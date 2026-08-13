// Last updated: 8/13/2026, 10:19:15 AM
class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}