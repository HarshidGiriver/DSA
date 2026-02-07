package Recursions.Combination_Sum_1;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_1 {
    
    public void combi(int index,int arr[] ,int target, ArrayList<Integer>curr,ArrayList<ArrayList<Integer>>fin)
    {
        
            if(target==0)
            {
                fin.add(new ArrayList<>(curr));
                return;
            }
            if(index==arr.length)
            {
                return;
            }

            //pick
            if(arr[index]<=target){
            curr.add(arr[index]);
            combi(index,arr,target-arr[index],curr,fin);

            //backtrack
            curr.remove(curr.size()-1);
            }
            
            //dont pick
            combi(index+1 , arr,target, curr,fin);
            
        

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       
        ArrayList<ArrayList<Integer>> fin = new ArrayList<>();
        combi(0,candidates,target,new ArrayList<>(),fin);

        return new ArrayList<>(fin);
    }
}
    

