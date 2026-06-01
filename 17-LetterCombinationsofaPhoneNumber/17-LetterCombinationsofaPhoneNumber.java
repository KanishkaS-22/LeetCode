// Last updated: 6/1/2026, 5:02:24 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3       int i=m;
4       for(int j=0;j<n;j++){
5        nums1[i]=nums2[j];
6        i++;
7       }
8       Arrays.sort(nums1);
9    }
10}