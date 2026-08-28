// Last updated: 8/28/2026, 11:34:02 PM
1class Solution {
2    public String lexGreaterPermutation(String s, String target) {
3        int[] count=new int[26];
4        for(char ch:s.toCharArray()){
5            count[ch-'a']++;
6        }
7        StringBuilder ans=new StringBuilder();
8        int i=0;
9        while(i<s.length()){
10            int ch=target.charAt(i)-'a';
11            if(count[ch]>0){
12                ans.append(target.charAt(i));
13                count[ch]--;
14                i++;
15            }else{
16                break;
17            }
18        }
19        while(true){
20            if(i<s.length()){
21                for(int j=target.charAt(i)-'a'+1;j<26;j++){
22                    if(count[j]>0){
23                        ans.append((char)('a'+j));
24                        count[j]--;
25                        for(int k=0;k<26;k++){
26                            while(count[k]>0){
27                                ans.append((char)('a'+k));
28                                count[k]--;
29                            }
30                        }
31                        return ans.toString();
32                    }
33                }
34            }
35            if(i==0) return "";
36            i--;
37            count[target.charAt(i)-'a']++;
38            ans.deleteCharAt(ans.length()-1);
39        }
40    }
41}