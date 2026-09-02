// Last updated: 9/2/2026, 12:14:34 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int k=0;
4        for(int i=0;i<nums.length;i++){
5            if(k<2||nums[i]!=nums[k-2]){
6                nums[k]=nums[i];
7                k++;
8            }
9        }
10        return k;
11    }
12}