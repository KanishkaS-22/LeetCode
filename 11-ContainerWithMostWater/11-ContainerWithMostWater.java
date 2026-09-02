// Last updated: 9/2/2026, 11:25:54 AM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        String ans=strs[0];
4        for(int i=1;i<strs.length;i++){
5            while(!strs[i].startsWith(ans)){
6                ans=ans.substring(0,ans.length()-1);
7                if(ans.length()==0){
8                    return "";
9                }
10            }
11        }
12        return ans;
13    }
14}