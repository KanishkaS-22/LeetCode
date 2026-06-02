// Last updated: 6/2/2026, 3:02:32 PM
1class Solution {
2    public int firstMatchingIndex(String s) {
3        int l=0,h=s.length()-1;
4        while(l<=h){
5            if(s.charAt(l)==s.charAt(h)){
6                return l;
7            }
8                    l++;
9                    h--;
10                }
11        return -1;
12    }
13}