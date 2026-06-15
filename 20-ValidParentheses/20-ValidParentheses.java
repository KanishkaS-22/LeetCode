// Last updated: 6/15/2026, 9:10:35 AM
1class Solution {
2    public boolean isValid(String s) {
3       Stack<Character> st = new Stack<>();
4        for(char ch: s.toCharArray()){
5            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
6            else{
7                if(st.isEmpty()==true) return false;
8                if(st.peek()=='(' && ch==')' || st.peek()=='[' && ch==']' || st.peek()=='{' && ch=='}') st.pop();
9                else return false;
10            }
11        }
12        return st.isEmpty(); 
13    }
14}