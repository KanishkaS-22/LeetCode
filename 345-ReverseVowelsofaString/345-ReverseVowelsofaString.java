// Last updated: 6/15/2026, 9:05:05 AM
1class Solution {
2    public String reverseVowels(String s) {
3        int n=s.length();
4        char ch[]=s.toCharArray();
5        int start=0;
6        int end=n-1;
7        while(start<end){
8            if(!isVowel(ch[start])){
9                start++;
10            }
11            else if(!isVowel(ch[end])){
12                end--;
13            }
14            else{
15                char temp=ch[start];
16                ch[start]=ch[end];
17                ch[end]=temp;
18                start++;
19                end--;
20            }
21        }
22        return String.valueOf(ch);
23    }
24    public static boolean isVowel(char ch){
25        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
26            return true;
27        }
28        return false;
29    }
30}