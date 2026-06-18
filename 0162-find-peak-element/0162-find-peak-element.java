class Solution {
    public int findPeakElement(int[] arr) {
        
        if(arr.length==1) return 0;
        
        int start=0;
        int end=arr.length-1;
        if(arr[start]>arr[start+1]) return start;
        if(arr[end]>arr[end-1]) return end;
        while(start<end)
        {
            int mid=(start+end)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1] && mid<end && mid>start)
            {
                return mid;
                
            }
            
            if(arr[mid]>arr[mid+1] && mid<end) 
            {
                end=mid-1;
            }
            else
            { 
                start=mid+1;
            }
        }
        return start;
    }
}