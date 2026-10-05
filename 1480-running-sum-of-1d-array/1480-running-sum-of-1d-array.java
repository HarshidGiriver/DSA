class Solution {
    public int[] runningSum(int[] nums) {
        int i=0;
        int len=nums.length-1;
        int sum=0;
        int[] ans = new int[len+1];

        while (i<len+1){
            sum+=nums[i];
            ans[i]=sum;
            i++;
        }
        return ans;
        
    }
}