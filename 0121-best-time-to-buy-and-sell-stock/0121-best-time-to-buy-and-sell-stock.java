class Solution 
{
    public int maxProfit(int[] prices) 
    {
        
        int max_profit = 0;
        int cp = prices[0];     //Logic is assume the cost price as least value
        
//        for(int i=0;i<prices.length-1;i++)
//         {
//             for(int j=i+1;j<prices.length;j++)
//             {
//                 if(prices[j] > prices[i])
//                 {
//                     max_profit = Math.max(max_profit,(prices[j] - prices[i]));
//                     //curr_profit = sp - cp;
//                    // if(curr_profit > max_profit)
//                     //{
//                        // max_profit = curr_profit;
//                     //}
//                 }
                
//             }
//         }
        
        
        for(int i=1;i<prices.length;i++)
        {
            
            if(prices[i] < cp)
            {
                cp = prices[i];
            }
            else 
            {
                int curr_profit = prices[i] - cp;
                max_profit = Math.max(max_profit,curr_profit);
            }
        }
        
        return max_profit;
        
    }
}