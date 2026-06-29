// Last updated: 6/29/2026, 11:28:17 AM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String s : patterns)
            if (word.indexOf(s) != -1) count++; // -1 when not found
        return count;
    }
}