class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int len=nums.length;
        if(len%2!=0)
        {
            return false;
        }
        int times=len/2;
         
        for(int i=0;i<len;i++)
        {
            int count=0;
            int n=nums[i];
            for(int j=0;j<len;j++)
            {
                if(nums[j]==n)
                {
                    count++;
                }


            }
            if(count>=3)
            {
               return false;
            }
            count=0;
        }

        return true;
        
    }
}