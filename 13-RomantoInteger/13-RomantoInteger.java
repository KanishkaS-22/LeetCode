// Last updated: 6/15/2026, 9:11:42 AM
1class Solution {
2    public int intVal(char ch){
3        if(ch=='I')return 1;
4        else if(ch=='V')return 5;
5        else if(ch=='X')return 10;
6        else if(ch=='L')return 50;
7        else if(ch=='C')return 100;
8        else if(ch=='D')return 500;
9        else if(ch=='M')return 1000;
10        else return 0;
11    }
12    public int romanToInt(String s) {
13        int sum=0;
14        int i;
15        for(i=0;i<s.length()-1;i++){
16            if(intVal(s.charAt(i))>=intVal(s.charAt(i+1))){
17                sum+=intVal(s.charAt(i));
18            }else{
19                sum+=intVal(s.charAt(i+1))-intVal(s.charAt(i));
20                i++;
21            }
22        }
23        if(i!=s.length()) sum+=intVal(s.charAt(i));
24        return sum;
25    }
26}