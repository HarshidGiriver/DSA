class Solution {
    public boolean search(int[] nums, int target) {
        int pin = peak(nums);
        int start = 0;
        int end = pin;
        boolean found = false;
        int ans = -1;

        // Binary search on the first slope
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                found = true;
                ans = mid;
                break;
            }
        }

        // Binary search on the second slope
        if (!found) {
            start = pin+1;
            end = nums.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (nums[mid] < target) {
                    start = mid + 1;
                } else if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    found = true;
                    ans = mid;
                    break;
                }
            }
        }

        return found;
    }

    // Finds the index of the peak element
    int peak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
             int mid = (start + end) / 2;
            
            // If mid element is strictly greater than the next, mid is the absolute peak
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            // If mid element is strictly smaller than the previous, mid-1 is the peak
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                start++;
                end--;
            } 
            // Decide which half to look into
        else if (nums[mid] >= nums[start]) {
                // Left side is sorted normally, so the peak must be on the right side
                start = mid + 1;
            } else {
                // Right side is sorted, so the peak must be on the left side
                end = mid - 1;
            }
        }
        return start;
    }
}
