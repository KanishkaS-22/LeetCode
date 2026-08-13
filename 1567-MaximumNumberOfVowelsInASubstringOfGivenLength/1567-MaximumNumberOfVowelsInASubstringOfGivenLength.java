// Last updated: 8/13/2026, 10:16:02 AM
class Solution {
    public int maxVowels(String s, int k) {
        int max=0,count=0;
       for(int i=0;i<k;i++){
        char ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            count++;
        }
       }
    max=count;
    for(int i=k;i<s.length();i++){
        char left=s.charAt(i-k);
        if(left=='a'||left=='e'||left=='i'||left=='o'||left=='u'){
            count--;
        }
        char right=s.charAt(i);
        if(right=='a'||right=='e'||right=='i'||right=='o'||right=='u'){
            count++;
        }
        if(count>max){
            max=count;
        }
    }
    return max;
    }
}