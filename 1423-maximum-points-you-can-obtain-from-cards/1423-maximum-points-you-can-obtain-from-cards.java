class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int currentSum = 0;

        // Step 1: Get the sum of the first k cards from the left
        for (int i = 0; i < k; i++) {
            currentSum += cardPoints[i];
        }

        int maxScore = currentSum;

        // Step 2: Move a pointer from right to left, swapping cards
        for (int i = 0; i < k; i++) {
            currentSum -= cardPoints[k - 1 - i];       // Remove from left
            currentSum += cardPoints[n - 1 - i];       // Add from right
            maxScore = Math.max(maxScore, currentSum); // Track the best score
        }

        return maxScore;
    }
}
