// Last updated: 7/1/2026, 11:58:21 AM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n=nums.length;
4        for(int i=0;i<nums.length;i++){
5            n+=i-nums[i];
6        }
7        return n;
8    }
9}