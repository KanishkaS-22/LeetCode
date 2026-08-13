// Last updated: 8/13/2026, 10:17:47 AM
class Solution {
    public int[] constructRectangle(int area) {
        int w=(int)Math.sqrt(area);
        while(area%w!=0){
            w--;
        }
        return new int[]{area/w,w};
    }
}