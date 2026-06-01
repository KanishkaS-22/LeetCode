// Last updated: 6/1/2026, 4:06:25 PM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3       int l=0,r=nums.length-1;
4       while(l<r){
5        int m=(l+r)/2;
6        if(m%2==1){
7            m--;
8        }
9        if(nums[m]!=nums[m+1]){
10           r=m;
11        }else{
12            l=m+2;
13        }
14       }
15       return nums[l];
16    }
17}