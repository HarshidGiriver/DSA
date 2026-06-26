class Solution {
    public int arrangeCoins(int n) {
        long low=0;
        long high=n;
        while(low<=high)
        {
            long mid = low + (high - low) / 2; 
            // Uses long to prevent formula multiplication overflow
            long k = (mid * (mid + 1)) / 2; 
            if(k==n) return (int)mid;
            else if(k<n) low=mid+1;
            else high=mid-1;
        }
        return (int)high;
    }
}