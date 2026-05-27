// Last updated: 5/27/2026, 2:01:30 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int f=-1,l=-1;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]==target){
6                if(f==-1){
7                    f=i;
8                }
9                l=i;
10            }
11        }
12        return new int[]{f,l};
13    }
14}