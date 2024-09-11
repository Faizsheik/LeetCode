class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        /*for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i] == nums[j] && Math.abs(i-j)<=k)
                {
                    return true;
                }
            }
        } */
        
      /*  ArrayList<Integer> obj = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(obj.contains(nums[i]))
            {
                int j = obj.lastIndexOf(nums[i]);
                if(Math.abs(i-j) <= k)
                {
                    return true;
                }
                
            }
            obj.add(nums[i]);

        }
            */
        
       
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) 
        {
            if (map.containsKey(nums[i]))
            {
                int j = map.get(nums[i]);
                
                if (i-j <= k) 
                {
                    return true; 
                }
            }
            
            map.put(nums[i], i);
        }
        
  
        
        return false;
        
    }
}