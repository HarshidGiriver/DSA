/** 
 * Forward declaration of guess API.
 * @param num   your guess
 * @return      -1 if num is higher than the picked number
 *              1 if num is lower than the picked number
 *              otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        
        while (low <= high) {
            // Safe mid calculation to prevent integer overflow
            int mid = low + (high - low) / 2;
            int res = guess(mid);
            
            if (res == 0) {
                return mid; // Found the picked number
            } else if (res == -1) {
                high = mid - 1; // Guess is too high; move left bound down
            } else {
                low = mid + 1; // Guess is too low; move right bound up
            }
        }
        
        return -1;
    }
}
