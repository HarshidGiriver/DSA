class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        
        // Loop while both strings have characters remaining
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        
        // Append any leftover characters from word1
        while (i < word1.length()) {
            sb.append(word1.charAt(i++));
        }
        
        // Append any leftover characters from word2
        while (j < word2.length()) {
            sb.append(word2.charAt(j++));
        }
        
        return sb.toString();
    }
}
