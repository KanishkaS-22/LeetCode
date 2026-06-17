// Last updated: 6/17/2026, 2:17:42 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        int[] count = new int[26];
4        for(char i: s.toCharArray()) count[i -'a']++;
5        for(int i = 0; i < s.length(); i++) {
6            if(count[s.charAt(i) - 'a'] == 1) return i;
7        }
8        return -1;
9    }
10}