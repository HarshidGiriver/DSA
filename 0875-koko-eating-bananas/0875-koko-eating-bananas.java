class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int low=1;
       int high=piles[0];
         for (int pile : piles) {
            high = Math.max(high, pile);
        }

       int minans=high;

       while(low<=high)
       {
          int mid = low + (high - low) / 2;

           if(CanFinish(piles,mid,h))
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
 boolean CanFinish(int[] piles, int mid,int h)
 {
    long totalHours=0;
    for(int i=0;i<piles.length;i++)
    {
        totalHours += (piles[i] + mid - 1) / mid;
        
    }
    return totalHours<=h;
 }
  
}