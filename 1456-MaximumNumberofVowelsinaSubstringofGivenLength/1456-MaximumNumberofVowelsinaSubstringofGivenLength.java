// Last updated: 6/29/2026, 11:58:44 AM
1class Solution {
2    public int maxVowels(String s, int k) {
3        int max=0,count=0;
4       for(int i=0;i<k;i++){
5        char ch=s.charAt(i);
6        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
7            count++;
8        }
9       }
10    max=count;
11    for(int i=k;i<s.length();i++){
12        char left=s.charAt(i-k);
13        if(left=='a'||left=='e'||left=='i'||left=='o'||left=='u'){
14            count--;
15        }
16        char right=s.charAt(i);
17        if(right=='a'||right=='e'||right=='i'||right=='o'||right=='u'){
18            count++;
19        }
20        if(count>max){
21            max=count;
22        }
23    }
24    return max;
25    }
26}