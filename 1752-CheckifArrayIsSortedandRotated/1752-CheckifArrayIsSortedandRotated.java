// Last updated: 6/19/2026, 9:57:36 AM
1class Solution {
2    public boolean check(int[] nums) {
3        int c=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]>nums[(i+1)%nums.length]){
6                c++;
7            }
8        }
9        return c<=1;
10    }
11}