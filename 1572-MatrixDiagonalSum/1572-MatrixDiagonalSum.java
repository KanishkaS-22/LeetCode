// Last updated: 6/14/2026, 10:20:03 PM
1class Solution {
2    public int diagonalSum(int[][] mat) {
3         int n=mat.length;
4        int output=0;
5        for(int i=0;i<n;i++){
6            if(i==n-i-1)output+=mat[i][i];
7            else output+=(mat[i][i] + mat[n-i-1][i]);
8        }
9        return output;
10    }
11}