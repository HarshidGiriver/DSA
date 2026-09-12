import java.util.HashMap;
import java.util.Map;

class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0;
        int max_val = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        // r moves from left to right exactly once
        for (int r = 0; r < fruits.length; r++) {
            // Add the current fruit to the map
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            
            // Instead of resetting r, dynamically shrink the left side 'l'
            // ONLY until we drop back down to 2 types of fruit
            while (map.size() > 2) {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]); // Completely delete when count hits 0
                }
                l++; // Slide the left boundary forward
            }
            
            // The size of your current valid window is always (r - l + 1)
            max_val = Math.max(max_val, r - l + 1);
        }
        
        return max_val;
    }
}
