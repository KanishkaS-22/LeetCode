// Last updated: 5/30/2026, 4:10:42 PM
1class Solution {
2    public int maximumCount(int[] nums) {
3        int pc=0,nc=0,max=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]>0){
6                pc++;
7            }else if(nums[i]<0){
8                nc++;
9            }
10        }
11        if(pc>nc){
12            max=pc;
13        }else{
14            max=nc;
15        }
16        return max;
17    }
18}