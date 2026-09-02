// Last updated: 9/2/2026, 12:31:33 PM
1class Solution {
2    public int countDigitOne(int n) {
3        long f=1;
4        int ct=0;
5        while(f<=n){
6            long l=n%f;
7            long c=(n/f)%10;
8            long h=n/(f*10);
9            if(c==0){
10              ct+=h*f;
11            }else if(c==1){
12                ct+=h*f+l+1;
13            }else{
14                ct+=(h+1)*f;
15            }
16            f*=10;
17        }
18        return ct;
19    }
20}