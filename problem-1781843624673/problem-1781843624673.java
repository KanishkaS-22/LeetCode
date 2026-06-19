// Last updated: 6/19/2026, 10:03:44 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if(nums.length==0){
4            return 0;
5        }
6      int i=1;
7        for(int j=1;j<nums.length;j++){
8            if(nums[j]!=nums[i-1]){
9                nums[i]=nums[j];
10                i++;
11            }
12        }
13        return i;
14      }
15    }
16