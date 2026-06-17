class Solution {
    public int singleNonDuplicate(int[] arr) {
        int start=0;
        int end=arr.length-1;
        if(end==0)
        {
            return arr[0];
        }
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[end]!=arr[end-1]) return arr[end];

        while(start<end)
        {
            int mid=(start+end)/2;

            //check if we reached the element
            if(arr[mid]!= arr[mid+1] && arr[mid] != arr[mid-1] && mid>0 && mid<arr.length) return arr[mid];
            if(mid%2==0 && arr[mid]==arr[mid+1] && mid!=arr.length-1)
            {
                 start=mid+1;
            }
           if(mid%2!=0 && arr[mid]==arr[mid-1] && mid!=0)
            {
                start=mid+1;
            }
            if(mid%2==0 && arr[mid]==arr[mid-1] && mid!=0)
            {
                 end=mid-1;
            }
            if(mid%2!=0 && arr[mid]==arr[mid+1] && mid!=arr.length)
            {
                end=mid-1;
            }
            

        }
        return arr[start];
        
    }
}