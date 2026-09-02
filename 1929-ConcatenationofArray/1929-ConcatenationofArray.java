// Last updated: 9/2/2026, 10:30:30 AM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int n=nums.length;
4        int[]num2=new int[n+n];
5        for(int i=0;i<n;i++){
6            num2[i]=nums[i];
7        }
8        for(int i=0;i<n;i++){
9            num2[i+n]=nums[i];
10        }
11        return num2;
12    }
13}