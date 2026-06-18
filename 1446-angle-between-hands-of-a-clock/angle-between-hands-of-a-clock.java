class Solution {
    public double angleClock(int hour, int minutes) {
        double m=6.0*minutes;
        double h=30.0*(hour%12) +0.5 * minutes;
        double diff= Math.abs(h-m);
        return Math.min(diff,360.0-diff);
    }
}