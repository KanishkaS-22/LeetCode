// Last updated: 9/2/2026, 11:05:57 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashSet<Character>set=new HashSet<>();
4        int l=0;
5        int max=0;
6        for(int i=0;i<s.length();i++){
7            while(set.contains(s.charAt(i))){
8                set.remove(s.charAt(l));
9                l++;
10            }
11            set.add(s.charAt(i));
12            max=Math.max(max,i-l+1);
13        }
14        return max;
15    }
16}