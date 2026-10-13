class Solution {
    public int maxArea(int[] height) {
       
        int left=0;
        int right=height.length-1;
        int lowest;
        int area=0;
        int length=height.length;

        while(left<right)
        {
            lowest=Math.min(height[left],height[right]);
            length--;

            int new_area=lowest*length;

            if(new_area>area)
            {
                area=new_area;
            }

            if(lowest==height[left])
            {
                left++;
            }
            else
            {
                right--;
            }

        }
        
        return area;
    }
}