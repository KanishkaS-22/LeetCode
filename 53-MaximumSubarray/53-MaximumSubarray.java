// Last updated: 7/7/2026, 10:18:54 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3       int max=nums[0];
4       int sum=0;
5       for(int i=0;i<nums.length;i++){
6        //for(int j=i;j<nums.length;j++){
7           sum+=nums[i];
8           if(sum>max){
9            max=sum;
10           }
11           if(sum<0){
12            sum=0;
13           }
14        }
15     //  }
16       return max;
17    }
18}