// Last updated: 8/13/2026, 10:15:30 AM
class Solution {
    public int maximumCount(int[] nums) {
        int pc=0,nc=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pc++;
            }else if(nums[i]<0){
                nc++;
            }
        }
        if(pc>nc){
            max=pc;
        }else{
            max=nc;
        }
        return max;
    }
}