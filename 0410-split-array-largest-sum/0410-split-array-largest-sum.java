class Solution {
    static int splitArray(int[] nums, int k)
    {
        // first find the 
        //-> min possible ans=largest(nums)
        //-> max possible ans=sum(nums)

        int start=0; 
        int end=0; 
        for(int i=0;i<nums.length;i++)
        {
           start = Math.max(start, nums[i]); 
           end += nums[i];
        }
       
        // lets use the binary search
        // utill start < end run while
        while (start<end)
        {

            int mid = start + (end - start) / 2;
            int sum=0; 
            int p=1;  //initally one piece
            for(int i=0;i<nums.length;i++)
            {
                if((sum + nums[i])>mid) //if the addition would exceed the limit 
                {
                    sum=nums[i];
                    p++;
                }
                else{   //no problem (no exceed)
                    sum+=nums[i];  
                }


            }
            if(p<=k)  //if pieces is within range given
            {
                end=mid;  
            }
            else  //if not
            {
                start=mid+1;
            }

        }
        return start; //can return either start or end
    }
}