// Last updated: 8/13/2026, 10:15:37 AM
class Solution {
    public boolean isSameAfterReversals(int num) {
       int t1=num;
       int r1=0;
       while(num>0){
        int d=num%10;
        r1=r1*10+d;
        num=num/10;
       }
       int r2=0;
       while(r1>0){
        int d2=r1%10;
        r2=r2*10+d2;
        r1=r1/10;
       }
       return r2==t1;
    }
}