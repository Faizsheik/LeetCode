class Solution 
{
    public int majorityElement(int[] nums)
    { 
        if(nums.length==1)
        {
            return nums[0];
        }
        Arrays.sort(nums);
        int res = 0;
        
        int c = 1,n=nums.length;
        
        for(int i=1;i<nums.length;i++)
        {         
                if(nums[i]!=nums[i-1])
                {
                       c=1;
                }
                else
                {

                        c=c+1;
                }
                                   
                if(c > n/2) 
                {
                        res = nums[i-1];
                        break;
                }
          }
        return res;
    }
}