// Last updated: 8/13/2026, 10:17:35 AM
class Solution {
    public String reverseWords(String s) {
        String rev="";
        String words[]=s.split(" ");
        for(int i=0;i<words.length;i++){
            for(int j=words[i].length()-1;j>=0;j--){
                rev=rev+words[i].charAt(j);
            }
            if(i!=words.length-1){
                rev+=" ";
            }
        }
        return rev;
    }
}