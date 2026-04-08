// Last updated: 4/8/2026, 8:16:25 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int k=0, a=0;
        for(int i=0; i< nums.length;i++)
        {
            sum+= nums[i];
            if(nums[i]>9)
            {
                 a=nums[i];
                while(a>0)
                {
                k+=a%10;
                a/=10;
            }
        }
        else
        {
            k+=nums[i];
        }
        }
        return sum-k;

}
}