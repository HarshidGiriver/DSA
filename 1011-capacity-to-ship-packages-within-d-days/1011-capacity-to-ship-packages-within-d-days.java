class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i=0;i<weights.length;i++)
        {
            high+=weights[i];
            low = Math.max(low, weights[i]);
        }

        int minans=high;

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(can(weights,mid,days))
            {
                minans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }

        return minans;
        
    }

    boolean can(int[] arr,int mid,int d)
    {
        int daysNeeded = 1;
        int currentWeight = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (currentWeight + arr[i] > mid) {
                daysNeeded++;
                currentWeight = arr[i];
            } else {
                currentWeight += arr[i];
            }
        }
        return daysNeeded <= d;
    }
}