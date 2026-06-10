class Solution {
    public int countNegatives(int[][] grid) {
        int s1=grid.length;
        int s2=grid[0].length;
        int count=0;
        for(int i=0;i<s1;i++)
        {
            for(int j=0;j<s2;j++)
            {
                if(grid[i][j]<0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}