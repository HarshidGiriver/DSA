class Solution {
    public boolean isSubsequence(String s, String t) {
        int len1=s.length();
        int len2=t.length();
        if(len1==0) return true;
        if(len2==0) return false;

        if(len1>len2) return false;

        int left=0;
        int right=0;

        while(left<len1 && right<len2)
        {
            char current=s.charAt(left);
            if(current==t.charAt(right))
            {
                left++;
                
            }
            right++;
            if(left==len1) return true;
        } 

        return false;
        
    }
}