import java.util.ArrayList;

class Solution 
{

    public int removeDuplicates(int[] arr) 
    {

        ArrayList<Integer> unique = new ArrayList<>();

        for(int i:arr)
        {
            if(!unique.contains(i))
            {
                unique.add(i);
            }
        }

        for(int i=0;i<unique.size();i++)
        {
            arr[i] = unique.get(i);
        }
          
        return unique.size();

    }

    
}