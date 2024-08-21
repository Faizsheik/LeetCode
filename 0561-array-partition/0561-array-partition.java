class Solution {
    public int arrayPairSum(int[] nums)
    {
        //In the ascending order , we dont need to find minimum
        
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i=i+2)
        {
            sum = sum + nums[i];
        }
        return sum;
    }
}