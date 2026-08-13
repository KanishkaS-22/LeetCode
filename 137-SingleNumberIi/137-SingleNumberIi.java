// Last updated: 8/13/2026, 10:19:31 AM
class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                   c++;
                }
            }
        
        if(c==1){
           return nums[i];
        }
        }
        return -1;
    }
}