// Last updated: 6/14/2026, 10:23:34 PM
1class Solution {
2    public boolean checkPerfectNumber(int num) {
3        int temp = num ;
4        int sum = 0;
5        for(int i = 1 ; i <= num/2 ; i++){
6            if(num%i == 0){
7                sum += i;
8            }
9        }
10        if(sum == temp){
11            return true;
12        }
13        else{
14            return false;
15        }
16    }
17}