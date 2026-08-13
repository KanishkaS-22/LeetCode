// Last updated: 8/13/2026, 10:15:14 AM
class Solution {
    public String trafficSignal(int timer) {
        if(timer==0){
            return "Green";
        }else if(timer==30){
            return "Orange";
        }else if(timer>30&&timer<=90){
            return "Red";
        }else{
            return "Invalid";
        }
    }
}