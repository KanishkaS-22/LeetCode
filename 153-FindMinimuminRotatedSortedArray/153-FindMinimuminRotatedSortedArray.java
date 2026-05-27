// Last updated: 5/27/2026, 2:54:00 PM
1class Solution {
2    public int reverse(int x) {
3        int rev=0;
4        while(x!=0){
5            int d=x%10;
6            if(rev > Integer.MAX_VALUE / 10 || 
7               rev < Integer.MIN_VALUE / 10){
8                return 0;
9            }
10            rev=rev*10+d;
11            x=x/10;
12        }
13        return rev;
14    }
15}