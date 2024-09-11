import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        
       /* if(nums[0]==nums[n-1])
        {    
                if(nums[0] == n)
                {
                    int e = 1;
                    while(e<n)
                    {
                        result.add(e);
                        e++;
                    }
                }
                else if(nums[0]<n)
                {
                    result.add(n);
                    
                }
        }
        
        
        for(int i=0;i<n-1;i++)
        {
            if(!((nums[i+1]==nums[i] + 1) || (nums[i+1] == nums[i])))
            {
               int  diff = nums[i+1] - nums[i];
                int e = 1;
                while(e<diff)
                {
                    result.add(nums[i]+e);
                    e++;
                }
            }
        }*/
        
        int expected = 1; 
        
        for (int num : nums) 
        {
            while (num > expected) 
            {
                result.add(expected);
                expected++;
            } 
            if (num == expected)
            {
                expected++;
            }
        }
        while (expected <= n) {
            result.add(expected);
            expected++;
        }
        
        return result;
    }
}
