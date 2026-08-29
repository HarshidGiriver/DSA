class Solution {
    public boolean judgeCircle(String moves) {
        //['u','d']
        char[] arr = moves.toCharArray();
        int up=0;
        int down=0;
        int left=0;
        int right=0;

        for(char i : arr)
        {
            if(i=='U')
            {
                up++;
            }
            else if(i=='D')
            {
                down++;
            }
            else if(i=='L')
            {
                left++;
            }
            else
            {
                right++;
            }
        }

        int res1=up-down;
        int res2=right-left;

        if(res1==0 && res2==0) return true;
        
        return false;

        
    }
}