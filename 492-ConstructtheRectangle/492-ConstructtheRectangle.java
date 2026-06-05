// Last updated: 6/5/2026, 1:58:09 PM
1class Solution {
2    public int[] constructRectangle(int area) {
3        int w=(int)Math.sqrt(area);
4        while(area%w!=0){
5            w--;
6        }
7        return new int[]{area/w,w};
8    }
9}