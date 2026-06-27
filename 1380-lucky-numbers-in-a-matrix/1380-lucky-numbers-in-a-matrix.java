import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] arr1 = new int[row];
        int[] arr2 = new int[col];

        // 1. Find the minimum element in each row
        for (int i = 0; i < row; i++) {
            int min = Integer.MAX_VALUE; // Safe against large matrix numbers
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            arr1[i] = min;
        }

        // 2. Find the maximum element in each column (Fixed loops and indices)
        for (int j = 0; j < col; j++) { // Loop through columns first
            int max = Integer.MIN_VALUE; // Safe against negative or small numbers
            for (int i = 0; i < row; i++) { // Then loop through rows
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            arr2[j] = max; // Store in the column array safely
        }
        
        // 3. Find matches
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr1[i] == arr2[j]) {
                    lst.add(arr1[i]);
                }
            }
        }
        return lst;
    }
}
