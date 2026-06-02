// Last updated: 6/2/2026, 2:39:37 PM
1class Solution {
2    public String reverseWords(String s) {
3        String rev="";
4        String words[]=s.split(" ");
5        for(int i=0;i<words.length;i++){
6            for(int j=words[i].length()-1;j>=0;j--){
7                rev=rev+words[i].charAt(j);
8            }
9            if(i!=words.length-1){
10                rev+=" ";
11            }
12        }
13        return rev;
14    }
15}