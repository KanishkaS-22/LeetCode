// Last updated: 8/13/2026, 10:15:12 AM
class Solution {
    public String triangleType(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n1=nums[i];
            int n2=nums[i+1];
            int n3=nums[i+2];
            if((n1+n2>n3)&&(n1+n3>n2)&&(n2+n3>n1)){
            if(n1==n2&&n1==n3){
                return "equilateral";
            }else if(n1==n2||n1==n3||n2==n3){
                return "isosceles";
            }else if((n1+n2>n3)&&(n1+n3>n2)&&(n2+n3>n1)){
                return "scalene";
            }
            break;
        }
        return "none";
        }
        return "none";
    }
}