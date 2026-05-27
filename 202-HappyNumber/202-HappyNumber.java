// Last updated: 5/27/2026, 3:47:50 PM
1class Solution {
2    public boolean isHappy(int n) {
3        if(n==1||n==7){
4            return true;
5        }else if(n<10){
6            return false;
7        }
8        else{
9        int sum=0;
10       while(n>0){
11        int d=n%10;
12        sum=sum+(d*d);
13        n=n/10;
14       } 
15      return isHappy(sum);
16    }
17}
18}