class Solution {
    public double angleClock(int hour, int minutes) {
        // Step 1: Normalize hour 12 to 0
        if (hour == 12) {
            hour = 0;
        }
        
        // Step 2: Calculate the difference using your absolute formula
        double ans = Math.abs((30.0 * hour) - (5.5 * minutes));
        
        // Step 3: Return the smaller of the two possible angles
        return Math.min(ans, 360.0 - ans);
    }
}
