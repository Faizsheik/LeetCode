class Solution 
{
    public int firstUniqChar(String s)
    {
         for(int i=0;i<s.length();i++)
         {
             char c = s.charAt(i);
             int first = s.indexOf(c);
             int last = s.lastIndexOf(c);
             if(first == last)
             {
                 return first;
                 
             }
         }
        return -1;
        
    }
}