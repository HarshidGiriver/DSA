import java.util.*;
class printing_all_subseq
{
 
    public static void Print( int index , int arr[] , ArrayList<Integer> curr)
    {
            if(arr.length==index)
            {
                System.out.println(curr);
                return;
            }

            //Take method
            curr.add(arr[index]);
            Print(index+1,arr,curr);

            //backtrack
            curr.remove(curr.size()-1);

            //Don't take method
            Print(index+1,arr,curr);


    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,4};
        Print(0,arr,new ArrayList<>());

    }
 

}
