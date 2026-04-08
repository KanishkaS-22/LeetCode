// Last updated: 4/8/2026, 8:17:54 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int end=s.length()-1;
        while(end>=0&&s.charAt(end)==' '){
            end--;
        }
        int start =end;
        while(start>=0&&s.charAt(start)!=' '){
            start--;
        }
        return end-start;
    }
}