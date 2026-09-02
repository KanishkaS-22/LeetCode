// Last updated: 9/2/2026, 11:18:36 AM
1class Solution {
2    public String longestPalindrome(String s) {
3        int n=s.length();
4        String res="";
5        for(int i=0;i<n;i++){
6            int st=i,end=i;
7            while(st>=0&&end<n&&s.charAt(st)==s.charAt(end)){
8                st--;
9                end++;
10            }
11            String t=s.substring(st+1,end);
12            if(t.length()>res.length()){
13                res=t;
14            }
15            st=i;
16            end=i+1;
17            while(st>=0&&end<n&&s.charAt(st)==s.charAt(end)){
18                st--;
19                end++;
20            }
21            t=s.substring(st+1,end);
22            if(t.length()>res.length()){
23                res=t;
24            }
25        }
26        return res;
27    }
28}