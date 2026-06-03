// Last updated: 6/3/2026, 2:01:39 PM
1class Solution {
2    public int subtractProductAndSum(int n) {
3        int sum=0,p=1,res=0;
4        while(n>0){
5                int d=n%10;
6                sum+=d;
7                p=p*d;
8                n=n/10;
9            }
10        res=p-sum;
11        return res;
12    }
13}