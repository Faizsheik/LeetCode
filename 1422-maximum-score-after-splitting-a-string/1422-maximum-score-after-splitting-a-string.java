class Solution 
{
    public int maxScore(String s) 
    {
        

        // String s1 = " ",s2 = " ";
//         for(int i=1;i<s.length();i++)
//         {
//             // String  s1 = s1.replace(" ",s.substring(0,i+1));
//              // String s2 = s2.replace(" ",s.substring(i+1,s.length()));
            
//                  s1 = s1.substring(0,i);  
            
//               //incorrected use of replace beacuse  it does not constructing new subsstrung
            
//                  s2 = s2.substring(i);
            
//                 for(int k=0;i<s1.length();k++)
//                 {
//                     if(s1.charAt(k) == '0')
//                     {
//                         left = left+1;
//                     }
//                 }

//                 for(int j=0;j<s2.length();j++)
//                 {
//                     if(s2.charAt(j) == '1')
//                     {

//                         right = right+1;
//                     }
//                 }

//                 curr_score = left + right;

//                 if(curr_score > max_score)
//                 {
//                     max_score = curr_score;
//                 }
//         }
        
        
        //correct approach --> dynamically update the things using two pointer approach
        
        int left = 0 ,right=0,max_score=0;
        for(int  i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '1')
            {
                right = right+1;
            }
        }
        
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i) == '0')
            {
                left++;
            }
            else
            {
                right--;
            }
        
           int curr_score = left+ right;
           max_score = Math.max(max_score, curr_score);
        }
       return max_score;
        
    }
}




