class Solution 
{
    public int calPoints(String[] operations)
    {
        int j=0;  
        int[] arr = new int[operations.length];
        for(int i=0;i<operations.length;i++)
        {
            
            // if(isInteger(operations[i]))
            //     {
            //           arr[j++] = Integer.parseInt(operations[i]);
            //     }
             if(operations[i].equals("+"))
             {
                 if(j>=2)
                 {
                   arr[j] = arr[j-1] +  arr[j-2]; 
                    j++;
                 }
             }
            else if(operations[i].equals("D"))
             {
                   if(j>=1)
                   {
                    arr[j] = arr[j-1] * 2; 
                       j++;
                   }
             }
            else if(operations[i].equals("C"))
            {      
                if(j>=1)
                { 
                  arr[j-1] = 0;
                  j--; 
                    
                }
            }
            else
            {
                 arr[j++] = Integer.parseInt(operations[i]);
            }
               
        }
        
        int total = 0;
        
        for(int i:arr)
        {
            total = total + i;
        }
        
        return total;
    }
}