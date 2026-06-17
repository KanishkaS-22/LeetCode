// Last updated: 6/17/2026, 2:22:39 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        char[]arr1=s.toCharArray();
4        char[]arr2=t.toCharArray();
5        Arrays.sort(arr1);
6        Arrays.sort(arr2);
7        if(Arrays.equals(arr1,arr2)){
8            return true;
9        }
10        return false;
11    }
12}