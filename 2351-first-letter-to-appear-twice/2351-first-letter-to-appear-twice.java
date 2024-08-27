class Solution 
{
    public char repeatedCharacter(String s)
    {
        // char ch = '\0';
        //        for(int i=0;i<s.length()-1;i++)
        //         {
        //             if(s.charAt(i) == s.charAt(i+1))
        //             {
        //                 ch = s.charAt(i);
        //                 break;
        //             }
        //         }
        
        
        int[] arr = new int[26];
           
        
        for(char i : s.toCharArray())
        {
            char ch = i;
            if(arr[ch - 'a'] == 1)
            {
                return ch;
            }
            else
            {
                arr[ch - 'a']++;
            }
        }
        return ' ';
        
    }
}