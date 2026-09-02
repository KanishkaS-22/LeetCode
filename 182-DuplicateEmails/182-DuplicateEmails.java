// Last updated: 9/2/2026, 12:24:13 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int l=0;
4        int sum=0;
5        int min=Integer.MAX_VALUE;
6        for(int r=0;r<nums.length;r++){
7            sum+=nums[r];
8            while(sum>=target){
9                min=Math.min(min,r-l+1);
10                sum-=nums[l];
11                l++;
12            }
13        }
14        if(min==Integer.MAX_VALUE){
15            return 0;
16        }
17        return min;
18    }
19}