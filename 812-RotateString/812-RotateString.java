// Last updated: 4/8/2026, 8:16:40 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        return(s+s).contains(goal);
    }
}