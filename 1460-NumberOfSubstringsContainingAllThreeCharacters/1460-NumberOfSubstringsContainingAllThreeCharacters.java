// Last updated: 8/13/2026, 10:16:06 AM
class Solution {
    public int numberOfSubstrings(String s) {
        int c=0,l=0;
        int[]arr=new int[3];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            while(arr[0]>0&&arr[1]>0&&arr[2]>0){
                c+=s.length()-i;
                arr[s.charAt(l)-'a']--;
                l++;
            }
        }
       return c;
    }
}