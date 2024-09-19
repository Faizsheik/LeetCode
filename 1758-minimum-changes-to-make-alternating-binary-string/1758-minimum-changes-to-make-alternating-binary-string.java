
/*class Solution
// {
//     public int minOperations(String s)
//     {
//         int count1 = 0,count2 = 0;
//         char[] arr = s.toCharArray();
//         int m=0,n=m+1,i=0,j=i+1;
//         if(arr[0] == '1')
//         {
//                 arr[0] = '0';
//                 count1=count1+1;

//                 while(i<arr.length-2 && j<arr.length)
//                 {
  
//                      if((arr[i] == '0' && arr[j] == '0'))
//                         {
//                             arr[j] = '1'; 
//                             count1 = count1 + 1;
                            
//                         }
//                         else if((arr[i] == '1' && arr[j] == '1'))
//                         {
//                             arr[j] = '0'; 
//                             count1 = count1 + 1;
                            
//                         }

//                     i++;
//                     j++;

//                 }

//         }
          
//          if(arr[0] == '0')
//         {
//                 arr[0] = '1';
//                 count2 = count2+1;
             
//                 while(m<arr.length-2 && n<arr.length)
//                 {
                    
//                         if((arr[m] == '1' && arr[n] == '1'))
//                         {
//                             arr[n] = '0'; 
//                             count2 = count2 + 1;
                            
//                         }
//                         else if((arr[m] == '0' && arr[n] == '0'))
//                         {
//                             arr[n] = '1'; 
//                             count2 = count2 + 1;
                            
//                         }
//                     i++;
//                     j++;
//                 }
//             }
        
//         return Math.min(count1,count2);
                 
//     }
// }*/

class Solution {
    public int minOperations(String s) {
        int count1 = 0, count2 = 0;

        for (int i = 0; i < s.length(); i++)
        {
            char expectedChar1 = (i % 2 == 0) ? '0' : '1'; // Pattern "010101..."
            char expectedChar2 = (i % 2 == 0) ? '1' : '0'; // Pattern "101010..."

            if (s.charAt(i) != expectedChar1) {
                count1++; // Change to match the "010101..." pattern
            }
            if (s.charAt(i) != expectedChar2) {
                count2++; // Change to match the "101010..." pattern
            }
        }

        // Return the minimum number of changes required
        return Math.min(count1, count2);
    }
}
