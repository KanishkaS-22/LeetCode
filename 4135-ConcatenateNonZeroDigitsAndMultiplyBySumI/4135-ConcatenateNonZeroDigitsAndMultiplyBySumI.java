// Last updated: 8/13/2026, 10:15:15 AM
class Solution {
    public long sumAndMultiply(int n) {
        int t=0;
        int m=0;
        int x=1;
        while(n>0){
         int d=n%10;
         if(d!=0){
          m+=d*x;
          t=t+d;
          x*=10;
         }
         n/=10;
        }
    return (long) m*t;
    }
}
