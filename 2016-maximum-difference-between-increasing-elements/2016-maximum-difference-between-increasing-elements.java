class Solution {
    public int maximumDifference(int[] nums) 
    {
        
//only 22 test cases passed.
// int curr_diff = 0;
//         for(int i=1;i<nums.length;i++)
//         {
//             if(nums[i] > nums[i-1])
//             {
//                 curr_diff = nums[i]-nums[i-1];
//                 max_diff = Math.max(curr_diff,max_diff);
//             }
//         }
        
//         if(max_diff == 0)
//         {
//             return -1;
//         }
        
        int min = Integer.MAX_VALUE;
        int max_diff = -1;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > min)
            {
                max_diff = Math.max(max_diff,(nums[i]-min));
            }
            else
            {
                min = nums[i];
            }
        }

        
    
        
        return max_diff;
    }
}