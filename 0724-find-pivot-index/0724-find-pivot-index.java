class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int n = nums.length;
        int res = 0,flag = 0;
        if(n == 1)
        {
            res = 0;
            flag = 1;

        }
        else
        {
             for(int i=0;i<n;i++)
            {
                int left = 0;
                int right = 0;

                for(int j=0;j<i;j++)
                {
                    left = left + nums[j];
                }
                for(int m=i+1;m<n;m++)
                {   
                    right = right + nums[m];
                }
                if(left == right)
                {
                        res = i;
                        flag = 1;               //index was found
                        break;
                }
            }
        }
        
        if (flag == 0)
        {
            res = -1;
        }
        return res;
    }
}