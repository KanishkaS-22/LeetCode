// Last updated: 7/3/2026, 12:21:46 PM
1class Solution {
2    public int thirdMax(int[] nums) {
3       long m1=Long.MIN_VALUE;
4       long m2=Long.MIN_VALUE;
5       long m3=Long.MIN_VALUE;
6       for(int i=0;i<nums.length;i++){
7        if(nums[i]==m1||nums[i]==m2||nums[i]==m3){
8            continue;
9        }
10        if(nums[i]>m1){
11            m3=m2;
12            m2=m1;
13            m1=nums[i];
14        }else if(nums[i]>m2){
15            m3=m2;
16            m2=nums[i];
17        }else if(nums[i]>m3){
18            m3=nums[i];
19        }
20        }
21        if(m3==Long.MIN_VALUE){
22             return (int)m1;
23        }
24       
25return (int)m3;
26    }
27}