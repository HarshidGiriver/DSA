class Solution {
    public int removeDuplicates(int[] nums) {
       int insertindex=1;
       int travel=1;
       while(travel<=nums.length-1)
           {
               if(nums[travel]!=nums[insertindex-1])
               {
                   nums[insertindex]=nums[travel];
                   insertindex++;
               }
               travel++;
           }
       return insertindex;
    }
}