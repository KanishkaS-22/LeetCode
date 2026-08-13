// Last updated: 8/13/2026, 10:18:29 AM
class Solution {
    public int addDigits(int num) {
        if(num<=9){
            return num;
        }
        while(num>9){
            int sum=0;
            while(num!=0){
            int d=num%10;
            sum=sum+d;
            num=num/10;
            }
        num=sum;
        }
        return num;
    }
}