// Last updated: 6/29/2026, 9:45:52 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int max=Integer.MIN_VALUE;
4        int s=0;
5      for(int i=0;i<nums.length;i++){
6            s=s+nums[i];
7            if(s>max){
8              max=s;
9            }
10            if(s<0){
11                s=0;
12            }
13      }
14      return max;
15    }
16}