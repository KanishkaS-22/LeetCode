// Last updated: 5/29/2026, 2:11:58 PM
1class Solution {
2    public char findTheDifference(String s, String t) {
3       char ans=0;
4       for(int i=0;i<s.length();i++){
5        ans^=s.charAt(i);
6       }
7       for(int j=0;j<t.length();j++){
8        ans^=t.charAt(j);
9       }
10       return ans;
11    }
12}