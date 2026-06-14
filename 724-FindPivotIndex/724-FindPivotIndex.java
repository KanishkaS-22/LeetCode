// Last updated: 6/14/2026, 10:22:02 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3         int n=nums.length;
4        int []ps=new int[n];
5        int []ss=new int[n];
6        ps[0]=nums[0];
7        for(int i=1;i<n;i++){
8            ps[i]=nums[i]+ps[i-1];
9        }
10        ss[n-1]=nums[n-1];
11        for(int i=n-2;i>=0;i--){
12            ss[i]=nums[i]+ss[i+1];
13        }
14        for(int i=0;i<n;i++){
15           if(ps[i]==ss[i]) return i;
16        }
17         return-1;
18    }
19}