// Last updated: 8/13/2026, 10:19:19 AM
class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            int p=1;
            for(int j=i;j<nums.length;j++){
                p=nums[j]*p;
                if(max<p){
                    max=p;
                }
            }
        }
        return max;
    }
}