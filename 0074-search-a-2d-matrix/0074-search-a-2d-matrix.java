class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s1= matrix.length-1;
        int s2= matrix[0].length-1;

        int start=0;
        int end=s2;
        int count=0;
        
        while(start<=end)
        {
        
            int mid=(start+end)/2;
            if(matrix[count][mid]==target)
            {
                return true;
            }
            else if(matrix[count][mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
            
            if(start>end && count != s1)
            {
                count++;
                start=0;
                end=s2;
            }
        
        }

        return false;
    }
}