class Solution {
    public int distributeCandies(int[] candyType)
    {
        int type = 1,max = 0,l = candyType.length/2;
        
        Arrays.sort(candyType);
        //calculate the type of candies
        for(int i= 1;i<candyType.length;i++)
        {
            if(candyType[i] != candyType[i-1])
            {
                type = type+1;
            }
        }
        
        
        if(type == l)
        {
            max = l;
        }
        else if (type < l)
        {
            max =  type;
        }
        else if(type > l)
        {
            max =  l;
        }
        return max;
        
    }
}