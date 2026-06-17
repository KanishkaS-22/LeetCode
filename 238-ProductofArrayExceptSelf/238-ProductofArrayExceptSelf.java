// Last updated: 6/17/2026, 12:09:02 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        return nums[n/2];
6    }
7}