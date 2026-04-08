// Last updated: 4/8/2026, 8:17:29 PM
class Solution {
    public int titleToNumber(String columnTitle) {
        int result=0;
        for(char c:columnTitle.toCharArray()){
            int value=c-'A'+1;
            result=result*26+value;
        }
        return result;
    }
}