/* The isBadVersion API is defined in the parent class VersionControl.
   boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        
        while (low < high) {
            // Prevents integer overflow: (low + high) / 2 can exceed Integer.MAX_VALUE
            int mid = low + (high - low) / 2;
            
            if (isBadVersion(mid)) {
                // The current mid is bad, so the first bad version is at or before mid
                high = mid;
            } else {
                // The current mid is good, so the first bad version must be after mid
                low = mid + 1;
            }
        }
        
        // When low == high, we have converged on the first bad version
        return low;
    }
}
