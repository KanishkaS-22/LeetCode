// Last updated: 6/15/2026, 7:50:37 AM
1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3         int count=0;
4        for(int i=0;i<nums.length;i++){
5            for(int j=0;j<nums.length;j++){
6                if(nums[i]==nums[j]&&i<j){
7                    count++;
8                }
9            }
10        }
11        return count;
12    }
13}