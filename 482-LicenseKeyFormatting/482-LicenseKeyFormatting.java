// Last updated: 8/6/2026, 2:38:20 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        s=s.replace("-","").toUpperCase();
4        StringBuilder sb=new StringBuilder();
5        int c=0;
6        for(int i=s.length()-1;i>=0;i--){
7             if(c==k){
8                sb.append("-");
9                c=0;
10             }
11             sb.append(s.charAt(i));
12             c++;
13        }
14        return sb.reverse().toString();
15    }
16}