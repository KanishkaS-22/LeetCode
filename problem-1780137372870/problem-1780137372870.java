// Last updated: 5/30/2026, 4:06:12 PM
1class Solution {
2    public int countNegatives(int[][] grid) {
3        int c=0;
4        for(int i=0;i<grid.length;i++){
5            for(int j=0;j<grid[i].length;j++){
6                if(grid[i][j]<0){
7                    c++;
8                }
9            }
10        }
11        return c;
12    }
13}