// Last updated: 6/3/2026, 2:13:10 PM
1class Solution {
2    public int findNumbers(int[] nums) {
3        int ct=0;
4        for(int i=0;i<nums.length;i++){
5            int c=0;
6            if(nums[i]<10){
7                c=1;
8            }else{
9            while(nums[i]>0){
10                c++;
11                nums[i]=nums[i]/10;
12            }
13            }
14        if(c%2==0){
15            ct++;
16        }
17        }
18        return ct;
19    }
20}