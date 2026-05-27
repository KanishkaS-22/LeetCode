// Last updated: 5/27/2026, 2:37:50 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int min=nums[0];
4        for(int i=0;i<nums.length;i++){
5           
6            if(nums[i]<min){
7                min=nums[i];
8            }
9        }
10     return min;   
11    }
12}