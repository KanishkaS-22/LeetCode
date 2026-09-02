// Last updated: 9/2/2026, 10:17:17 AM
1class Solution {
2    public int numberOfSteps(int num) {
3        int c=0;
4        while(num!=0){
5            if(num%2==0){
6                num=num/2;
7            }else{
8                num=num-1;
9            }
10            c++;
11        }
12        return c;
13    }
14}