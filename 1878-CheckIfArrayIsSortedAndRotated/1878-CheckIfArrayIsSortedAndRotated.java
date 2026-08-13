// Last updated: 8/13/2026, 10:15:48 AM
class Solution {
    public boolean check(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                c++;
            }
        }
        return c<=1;
    }
}