// Last updated: 9/2/2026, 11:41:26 AM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String,List<String>>map=new HashMap<>();
4        for(String s:strs){
5            char[]ch=s.toCharArray();
6            Arrays.sort(ch);
7            String key=new String(ch);
8            if(!map.containsKey(key)){
9                map.put(key,new ArrayList<>());
10            }
11            map.get(key).add(s);
12        }
13        return new ArrayList<>(map.values());
14
15    }
16}