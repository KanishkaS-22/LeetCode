// Last updated: 9/2/2026, 11:21:38 AM
1class Solution {
2    public int maxArea(int[] height) {
3        int n=height.length;
4        int area=0,left=0,right=n-1;
5        while(left<right){
6            int a=(right-left)*Math.min(height[left],height[right]);
7            area=Math.max(area,a);
8            if(height[left]<height[right]){
9                left++;
10            }else{
11                right--;
12            }
13        }
14        return area;
15    }
16}