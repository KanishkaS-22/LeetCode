// Last updated: 5/27/2026, 4:23:13 PM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        Arrays.sort(nums);
4        return nums[nums.length-k];
5    }
6}