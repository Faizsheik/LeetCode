class Solution {
    public int minimumDifference(int[] nums, int k) 
    {
        
        if(k==0)
        {
            return 0;
        }
        
        int mindif = Integer.MAX_VALUE;
       Arrays.sort(nums) ;//minimum diff is as close as possible
           
        for(int i=0,j=k-1;j<nums.length;i++,j++)
        {
            mindif = Math.min(mindif,nums[j]-nums[i]);
        }
        
        return mindif;
        
    }
}