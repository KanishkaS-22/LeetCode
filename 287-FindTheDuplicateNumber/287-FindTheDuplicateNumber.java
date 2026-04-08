// Last updated: 4/8/2026, 8:17:03 PM
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
           if(nums[i]==nums[i+1])
              return nums[i];
              return -1;
    }
}