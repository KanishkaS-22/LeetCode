// Last updated: 8/13/2026, 10:18:27 AM
class Solution {
    public int[] singleNumber(int[] nums) {
     int[]res=new int[2];
     int ind=0;
     for(int i=0;i<nums.length;i++){
        boolean found=false;
        for(int j=0;j<nums.length;j++){
            if(i!=j&&nums[i]==nums[j]){
                found=true;
                break;
            }
        }
        if(!found){
            res[ind++]=nums[i];
            if(ind==2){
                break;
            }
        }
     }
       return res;
    }
}