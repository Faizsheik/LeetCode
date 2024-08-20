class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int prev_count = 0;
        int curr_count = 0;
        for(int i=0;i<nums.length;i++)
        {
            
            if(nums[i] == 0)
            {
                prev_count = Math.max(prev_count, curr_count);
                curr_count = 0;
            }
            else
            {
                curr_count++;
            }
            
            
            
        }
        
        if(curr_count > prev_count)
        {
            return curr_count;
        }
        return prev_count;
        
    }
}