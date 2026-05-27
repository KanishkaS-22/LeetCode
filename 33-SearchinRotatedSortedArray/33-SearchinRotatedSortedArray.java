// Last updated: 5/27/2026, 2:30:27 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            int c=0;
5            for(int j=0;j<nums.length;j++){
6                if(nums[i]==nums[j]){
7                   c++;
8                }
9            }
10        
11        if(c==1){
12           return nums[i];
13        }
14        }
15        return -1;
16    }
17}