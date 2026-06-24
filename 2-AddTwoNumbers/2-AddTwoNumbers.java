// Last updated: 6/24/2026, 11:52:16 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int[]nums3=new int[nums1.length+nums2.length];
4        for(int i=0;i<nums1.length;i++){
5            nums3[i]=nums1[i];
6        }
7        for(int i=0;i<nums2.length;i++){
8            nums3[nums1.length+i]=nums2[i];
9        }
10        double k=0;
11        Arrays.sort(nums3);
12            if(nums3.length%2!=0){
13              int sum=nums3.length/2;
14              k=nums3[sum];
15            }else{
16              int sum2=nums3.length/2;
17              k=(nums3[sum2]+nums3[sum2-1])/2.0;
18            }
19            return k;
20        }
21    }
22