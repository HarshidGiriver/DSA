class Solution {
    public int findMin(int[] arr) {
        int start=0;
        int end=arr.length-1;
        if(arr[start]<=arr[end])
        {
            return arr[start];
        }

        while(start<end)
        {
            int mid=(start+end)/2;

            if(arr[mid]>arr[mid+1] && mid<end)
            {
                 return arr[mid+1];
            }
            if(arr[mid]<arr[mid-1] && mid>start)
            {
                return arr[mid];
            }

            if(arr[mid]<arr[start])
            {
               end=mid-1;
            }
            else
            {
               start=mid+1;
            }

        }
       return arr[start];
    }
}