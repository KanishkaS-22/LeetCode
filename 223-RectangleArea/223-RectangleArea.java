// Last updated: 5/29/2026, 2:40:20 PM
1class Solution {
2    public int addDigits(int num) {
3        if(num<=9){
4            return num;
5        }
6        while(num>9){
7            int sum=0;
8            while(num!=0){
9            int d=num%10;
10            sum=sum+d;
11            num=num/10;
12            }
13        num=sum;
14        }
15        return num;
16    }
17}