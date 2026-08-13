// Last updated: 8/13/2026, 10:18:03 AM
class Solution {
    public int getSum(int a, int b) {
        if(b>0){
         while(b-->0){
            a++;
        }
        }else{
            while(b++<0){
                a--;
            }
        }
        
        return a;
    }
}