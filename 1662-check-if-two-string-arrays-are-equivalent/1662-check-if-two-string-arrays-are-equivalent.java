class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2)
    {
        String s1 = "";
        String s2 = "";
        
        for(String i : word1)
        {
            s1 = s1+i;
        }
        
        for(String j : word2)
        {
            s2 = s2+j;
        }
        
        return s1.equals(s2);
        
        
        
        
    }
}