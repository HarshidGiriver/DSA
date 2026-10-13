class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // --- MINIMAL ADDITION START: Copy nums1 elements to read from safely ---
        int[] nums1Copy = new int[m];
        for (int i = 0; i < m; i++) {
            nums1Copy[i] = nums1[i];
        }
        // --- MINIMAL ADDITION END ---

        int left = 0; 
        int right = 0; 
        int index = 0; 
        
        // Minor boundary correction: changed '< n - 1' and '< m + n - 1' to '< n' and '< m' 
        // to cover all indices completely, and using nums1Copy instead of nums1.
        while (left < m && right < n) { 
            // Removed the zero-skipping check entirely as it is no longer needed
            if (nums1Copy[left] <= nums2[right]) {
                nums1[index] = nums1Copy[left];
                left++;
            } else {
                nums1[index] = nums2[right];
                right++;
            }
            index++;
        }
        
        // Clean up remaining elements from nums1Copy if any
        while (left < m) {
            nums1[index++] = nums1Copy[left++];
        }
        
        // Clean up remaining elements from nums2 if any
        while (right < n) {
            nums1[index++] = nums2[right++];
        }
    }
}
