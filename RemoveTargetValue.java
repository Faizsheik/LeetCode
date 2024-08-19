import java.util.ArrayList;
import java.util.Collections;

class RemoveTargetValue {
    public int removeElement(int[] nums, int val)
    {
        ArrayList<Integer> RemoveVal = new ArrayList<>();

        for(int i:nums)
        {
            RemoveVal.add(i);
        }

        RemoveVal.removeAll(Collections.singleton(val));

       for(int i=0;i<RemoveVal.size();i++)
       {
         nums[i] = RemoveVal.get(i);
       }

         return RemoveVal.size();
    }
}