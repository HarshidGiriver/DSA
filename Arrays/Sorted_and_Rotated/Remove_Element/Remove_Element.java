class Solution {
    public int removeElement(int[] nums, int val) {
        int result=0;
        for(int i : nums)
        {
            if(i!=val)
            {
                nums[result++]=i;
            }
        }
        return result;

    }
}