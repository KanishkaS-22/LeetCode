// Last updated: 9/2/2026, 11:45:42 AM
1class Solution {
2    public double myPow(double x, int n) {
3        long pow=n;
4        if(pow<0){
5            x=1/x;
6            pow=-pow;
7        }
8        double ans=1;
9        while(pow>0){
10            if(pow%2==1){
11                ans=ans*x;
12            }
13            x=x*x;
14            pow=pow/2;
15        }
16        return ans;
17    }
18}