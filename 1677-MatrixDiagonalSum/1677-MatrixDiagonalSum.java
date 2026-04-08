// Last updated: 4/8/2026, 8:16:22 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int output=0;
        for(int i=0;i<n;i++){
            if(i==n-i-1)output+=mat[i][i];
            else output+=(mat[i][i] + mat[n-i-1][i]);
        }
        return output;
    }
}