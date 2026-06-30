// Last updated: 6/30/2026, 11:53:01 AM
1class Solution {
2    public boolean checkXMatrix(int[][] grid) {
3        int n=grid.length;
4        for(int i=0;i<grid.length;i++){
5            for(int j=0;j<n;j++){
6                if((i==j)||(i+j==n-1)){
7                if(grid[i][j]==0){
8                   return false;
9                }
10                }else{
11                    if(grid[i][j]!=0){
12                        return false;
13                    }
14                }
15            }
16        }
17        return true;
18    }
19}