// Last updated: 10/12/2026, 4:20:37 PM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int p=nums[0];
4        int ind=0;
5        for(int i=1;i<nums.length;i++){
6            if(nums[i]>p){
7                p=nums[i];
8                ind=i;
9            }
10        }
11        return ind;
12    }
13}