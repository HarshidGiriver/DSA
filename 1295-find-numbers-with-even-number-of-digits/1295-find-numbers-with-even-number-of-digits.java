class Solution {
    public int findNumbers(int[] nums) {
        int size=nums.length;
        int count=0;
        for(int i=0;i<size;i++)
        {
            boolean result=even(nums[i]);
            if(result)
            {
                count++;
            }
            
        }
        return count;
        
    }

    static boolean even(int num)
    {
     int count=0;
        while(num>0)
        {  count++;
           num/=10;
        }
    return (count%2==0);
       
    }
}