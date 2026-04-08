// Last updated: 4/8/2026, 8:18:01 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
            else{
                if(st.isEmpty()==true) return false;
                if(st.peek()=='(' && ch==')' || st.peek()=='[' && ch==']' || st.peek()=='{' && ch=='}') st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }
}