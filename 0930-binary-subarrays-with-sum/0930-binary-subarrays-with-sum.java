class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count =0;
        int N=nums.length; //5

        for(int l=0;l<N;l++) // 0 to 4
        {
            int sum=0;   
            for(int r=l;r<N;r++)
            {
                sum+=nums[r];
                if(sum==goal)
                {
                    count++;
                    
                }
                if(sum>goal) 
                {
                    break;
                }
                


            }
        }
        return count;
    }
}