// Last updated: 6/2/2026, 4:04:02 PM
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        if(num==1){
4            return true;
5        }
6        for(long i=0;i<num;i++){
7            while(i*i==num){
8                return true;
9            }
10        }
11        return false;
12    }
13}