class Solution 
{
    public int lengthOfLastWord(String s) 
    {
      String ts = s.trim();
      String[] str = ts.split(" ");
      String laststr = str[str.length-1];
      return laststr.length();
            
            
    }
}