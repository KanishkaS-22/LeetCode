// Last updated: 6/30/2026, 11:26:20 AM
1class Solution {
2    public int numberOfSubstrings(String s) {
3        int c=0,l=0;
4        int[]arr=new int[3];
5        for(int i=0;i<s.length();i++){
6            arr[s.charAt(i)-'a']++;
7            while(arr[0]>0&&arr[1]>0&&arr[2]>0){
8                c+=s.length()-i;
9                arr[s.charAt(l)-'a']--;
10                l++;
11            }
12        }
13       return c;
14    }
15}