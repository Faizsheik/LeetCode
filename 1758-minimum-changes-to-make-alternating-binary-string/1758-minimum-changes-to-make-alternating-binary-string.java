
/*class Solution
 {
     public int minOperations(String s)
     {
         int count1 = 0,count2 = 0;
         char[] arr = s.toCharArray();
         int m=0,n=m+1,i=0,j=i+1;
         if(arr[0] == '1')
         {
                 //arr[0] = '0';
                 count1=count1+1;
                while(i<arr.length-2 && j<arr.length)
                   
                    if((arr[i] == '0' && arr[j] == '0'))
                         {
                             //arr[j] = '1'; 
                             count1 = count1 + 1;
                          
                         }
                         else if((arr[i] == '1' && arr[j] == '1'))
                         {
                            // arr[j] = '0'; 
                             count1 = count1 + 1;
                            
                         }

                     i++;
                     j++;

            }

         
         if(arr[0] == '0')
         {
                 //arr[0] = '1';
                 count2 = count2+1;
           
                 while(m<arr.length-2 && n<arr.length)
                 {
                    
                         if((arr[m] == '1' && arr[n] == '1'))
                         {
                            // arr[n] = '0'; 
                             count2 = count2 + 1;
                            
                         }
                         else if((arr[m] == '0' && arr[n] == '0'))
                         {
                             //arr[n] = '1'; 
                             count2 = count2 + 1;
                            
                         }
                     i++;
                     j++;
                 }
             }
          
          
        
         return Math.min(count1,count2);
                 
     }
}*/


/*class Solution {
    public int minOperations(String s) {
        int count1 = 0, count2 = 0; 
        int i = 0, j = 1;           

        // First pass: Consider the pattern starting with '0'
        while (i < s.length()) 
        {
            if (i % 2 == 0) { // For even indices, we expect '0'
                if (s.charAt(i) != '0') {
                    count1++; // Increment if it's not '0'
                }
            }
            else
            { // For odd indices, we expect '1'
                if (s.charAt(i) != '1') {
                    count1++; // Increment if it's not '1'
                }
            }
            i++;
        }

        // Reset pointers for the second pass
        i = 0;
        
        // Second pass: Consider the pattern starting with '1'
        while (i < s.length()) 
        {
            if (i % 2 == 0)
            { // For even indices, we expect '1'
                if (s.charAt(i) != '1') {
                    count2++; // Increment if it's not '1'
                }
            } 
            else 
            { // For odd indices, we expect '0'
                if (s.charAt(i) != '0') {
                    count2++; // Increment if it's not '0'
                }
            }
            i++;
        }

        // Return the minimum of both counts
        return Math.min(count1, count2);
    }
}*/


class Solution
{
    public int minOperations(String s)
    {
        
        int count1 = 0,count2 =0;
        int i=0;
        
        while(i<s.length())
        {
            if(i%2==0)
            {
                if(s.charAt(i)!='0')
                {
                    count1=count1+1;
                }
            }
            else
            {
                if(s.charAt(i)!='1')
                {
                    count1=count1+1;
                }
                
            }
            i++;
            
        }
        
        i=0;
        while(i<s.length())
        {
            if(i%2==0)
            {
                if(s.charAt(i)!='1')
                {
                    count2 = count2+1;
                }
                
            }
            else
            {
                 if(s.charAt(i)!='0')
                {
                    count2 = count2+1;
                }
            }
            i++;
        }
        return Math.min(count1,count2);
        
    }
}





