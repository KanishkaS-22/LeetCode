// Last updated: 6/3/2026, 2:30:42 PM
1class Solution {
2    public String triangleType(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            int n1=nums[i];
5            int n2=nums[i+1];
6            int n3=nums[i+2];
7            int r=0;
8            if((n1+n2>n3)&&(n1+n3>n2)&&(n2+n3>n1)){
9            if(n1==n2&&n1==n3){
10                return "equilateral";
11            }else if(n1==n2||n1==n3||n2==n3){
12                return "isosceles";
13            }else if((n1+n2>n3)&&(n1+n3>n2)&&(n2+n3>n1)){
14                return "scalene";
15            }
16            break;
17        }
18        return "none";
19        }
20        return "none";
21    }
22}