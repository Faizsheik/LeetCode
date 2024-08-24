class Solution 
{
    public int lengthOfLastWord(String s) 
    {
      
        
       int length = 0;
        String str = s.trim();
       for(int i=str.trim().length()-1;i>=0;i--)
       {
           if(str.charAt(i) != ' ')
           {
               length++;
           }
           else
           {
               break;
           }
       }
        
       return length;
        
        
        
// int length = 0;
// for(int i=s.trim().length()-1;i>=0;i--)  //here trimmed string is not stored 
// {
//     if(s.charAt(i) != ' ')     //afgain using original strinh that's why error.
//     {
//         length++;
//     }
//     //return length; --> when encounters first non space character it return the length..
//     else
//     {
//        if(length>0) break;
//     }
// }
 
 
// return length;
    }
                    
}
