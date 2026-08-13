// Last updated: 8/13/2026, 10:21:00 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]nums3=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            nums3[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            nums3[nums1.length+i]=nums2[i];
        }
        double k=0;
        Arrays.sort(nums3);
            if(nums3.length%2!=0){
              int sum=nums3.length/2;
              k=nums3[sum];
            }else{
              int sum2=nums3.length/2;
              k=(nums3[sum2]+nums3[sum2-1])/2.0;
            }
            return k;
        }
    }
