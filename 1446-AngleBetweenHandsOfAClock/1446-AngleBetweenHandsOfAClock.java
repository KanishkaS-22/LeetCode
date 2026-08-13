// Last updated: 8/13/2026, 10:16:09 AM
class Solution {
    public double angleClock(int hour, int minutes) {
        double m=30*hour+0.5*minutes;
        double n=6*minutes;
        double x= Math.abs(m-n);
        return Math.min(x,360-x);
    }
}