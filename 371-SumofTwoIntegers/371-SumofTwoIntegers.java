// Last updated: 6/4/2026, 4:34:08 PM
1class Solution {
2    public int getSum(int a, int b) {
3        if(b>0){
4         while(b-->0){
5            a++;
6        }
7        }else{
8            while(b++<0){
9                a--;
10            }
11        }
12        
13        return a;
14    }
15}