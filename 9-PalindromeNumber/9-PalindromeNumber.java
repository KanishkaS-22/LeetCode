// Last updated: 5/27/2026, 3:58:43 PM
1class Solution {
2    public String reverseWords(String s) {
3        s=s.trim();
4        String arr[]=s.split("\\s+");
5        String ans="";
6        for(int i=arr.length-1;i>=0;i--){
7            ans=ans+arr[i];
8            if(i!=0){
9                ans=ans+" ";
10            }
11        }
12        return ans;
13    }
14}