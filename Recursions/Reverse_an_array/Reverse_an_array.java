public class Reverse_an_array{
   
    public static void swap(int i , int arr[])
    {
        int n=arr.length;
        if(i>=n/2) return;
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;

        swap(i+1,arr);
    }

    public static void main(String [] args)
    {
        int arr[]={1,2,3,4};
        swap(0,arr);
        for(int i: arr)
        {
            System.out.println(i);
        }
    }


}