class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        int left = 0;
        int right = n - 1;
        int index = n - 1; // Start filling from the end (largest values)

        // Using <= ensures the middle element is processed
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                ans[index] = leftSquare;
                left++;
            } else {
                ans[index] = rightSquare;
                right--;
            }
            index--;
        }

        return ans;
    }
}
