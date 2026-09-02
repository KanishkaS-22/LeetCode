// Last updated: 9/2/2026, 11:36:21 AM
1class Solution {
2    public int jump(int[] nums) {
3        int jumps = 0;
4        int end = 0;
5        int farthest = 0;
6        for (int i = 0; i < nums.length - 1; i++) {
7            farthest = Math.max(farthest, i + nums[i]);
8            if (i == end) {
9                jumps++;
10                end = farthest;
11            }
12        }
13        return jumps;
14    }
15}