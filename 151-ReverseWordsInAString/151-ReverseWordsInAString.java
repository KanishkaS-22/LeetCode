// Last updated: 8/13/2026, 10:19:22 AM
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String arr[]=s.split("\\s+");
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            ans=ans+arr[i];
            if(i!=0){
                ans=ans+" ";
            }
        }
        return ans;
    }
}