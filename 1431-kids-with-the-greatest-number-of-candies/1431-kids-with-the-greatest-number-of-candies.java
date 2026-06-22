class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }
        List<Boolean> lst = new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i] + extraCandies >= maxCandies)
            {
                lst.add(true);
            }
            else
            {
                lst.add(false);
            }
        }
        
        return lst;
    }
}