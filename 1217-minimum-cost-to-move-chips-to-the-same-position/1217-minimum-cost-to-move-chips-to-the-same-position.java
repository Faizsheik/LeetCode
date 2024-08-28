class Solution 
{
    public int minCostToMoveChips(int[] position)
    {
        int even=0,odd=0;
        for(int i=0;i<position.length;i++)
        {
            if(position[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        return Math.min(even,odd);   //for odd to even position cost is one for number of cost depends on the total number of chips (minimun of even or odd)
    }
}