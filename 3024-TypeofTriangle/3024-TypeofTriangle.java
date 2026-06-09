// Last updated: 6/9/2026, 3:49:28 PM
1class Solution {
2    public String triangleType(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            int n1=nums[i];
5            int n2=nums[i+1];
6            int n3=nums[i+2];
7            if((n1+n2>n3)&&(n1+n3>n2)&&(n2+n3>n1)){
8            if(n1==n2&&n1==n3){
9                return "equilateral";
10            }else if(n1==n2||n1==n3||n2==n3){
11                return "isosceles";
12            }else if((n1+n2>n3)&&(n1+n3>n2)&&(n2+n3>n1)){
13                return "scalene";
14            }
15            break;
16        }
17        return "none";
18        }
19        return "none";
20    }
21}