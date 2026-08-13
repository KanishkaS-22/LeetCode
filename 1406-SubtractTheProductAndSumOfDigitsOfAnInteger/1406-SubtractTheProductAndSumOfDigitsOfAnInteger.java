// Last updated: 8/13/2026, 10:16:18 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,p=1,res=0;
        while(n>0){
                int d=n%10;
                sum+=d;
                p=p*d;
                n=n/10;
            }
        res=p-sum;
        return res;
    }
}