class Solution 
{
    public int[] plusOne(int[] digits)
    {

//Will not handle large numbers not efficient
// int sum=0,j=0;
//         for(int i=digits.length-1;i>=0;i--)
//         {
//             int p = (int)Math.pow(10,j);   
//             sum = sum+digits[i]*p;   // when cpnverting the array number --> 9876543210 it is greater than integer limit
//             j++;
//         }
//         int result = sum+1;   //124
        
//         String s = Integer.toString(result);
//         int arr[] = new int[s.length()];        
        
//         for(int i=0;i<s.length();i++)
//         {
//             arr[i] = Integer.parseInt(String.valueOf( s.charAt(i)));
//             //arr[i] = Character.getNumericValue(s.charAt(i));
//         }
        
//         return arr;
        
        
        
         for(int i=digits.length-1;i>=0;i--)
        {
             
             if(digits[i] < 9 )
             {
                 digits[i]++;
                 return digits;
             }
             digits[i] = 0;
         }
             digits = new int[digits.length+1]; //default all the elements will be 0.
             digits[0] = 1;
             
             return digits ; 
        
    }
}