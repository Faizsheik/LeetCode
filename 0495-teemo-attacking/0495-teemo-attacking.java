class Solution
{
    public int findPoisonedDuration(int[] timeSeries, int duration)
    {
        int total_duration = duration ;
       
        for(int i=1;i<timeSeries.length;i++)
        { 
            
             int timediff =  timeSeries[i]-timeSeries[i-1];
            
            //overlapping occurs , so add exact duration no excess time duraion;
             total_duration = total_duration + (Math.min(duration,timediff));
            
        }
        return total_duration;
        
    }
}