// Last updated: 8/13/2026, 10:16:14 AM
class Solution {
    public int findNumbers(int[] nums) {
        int ct=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            if(nums[i]<10){
                c=1;
            }else{
            while(nums[i]>0){
                c++;
                nums[i]=nums[i]/10;
            }
            }
        if(c%2==0){
            ct++;
        }
        }
        return ct;
    }
}