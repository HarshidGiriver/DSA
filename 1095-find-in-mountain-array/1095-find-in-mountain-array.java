/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
       int pin=peak(mountainArr);
        int start=0;
        int end=pin;
        boolean found=false;
        int ans=-1;
         while(start<=end)
         {
            int mid=(start+end)/2;
            if(mountainArr.get(mid)<target)
            {
                start=mid+1;
            }
            else if(mountainArr.get(mid)>target)
            {
                end=mid-1;
            }
            else
            {
                found=true;
                ans=mid;
                break;
            }
         }
         if(!found)
         {
            start=pin;
            end=mountainArr.length()-1;
            while(start<=end)
         {
            int mid=(start+end)/2;
            if(mountainArr.get(mid)>target)
            {
                start=mid+1;
            }
            else if(mountainArr.get(mid)<target)
            {
                end=mid-1;
            }
            else
            {
                found=true;
                ans=mid;
                break;
            }
         }
         }
        if(!found)
        {
            return -1;
        }

        return ans;
    }
   
    int peak(MountainArray mountainArr)
    {
        int start=0;
        int end=mountainArr.length()-1;
        
        while(start<end)
        {
            int mid=(start+end)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1))
            {
                start=mid+1;
            }
            
            else
            {
                end=mid;
            }
        }
        return start;
    }
}