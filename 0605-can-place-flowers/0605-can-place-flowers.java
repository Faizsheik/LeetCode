class Solution 
 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) 
    {
        int c = n;       

        if(c==0)
        {
            return true;
        }
        
          if(flowerbed.length==1)
          {
              if(flowerbed[0] == 0)
              {
                  flowerbed[0] = 1;
                  c=c-1;
                  if(c==0)
                  {
                      return true;
                  }
              }
              
          }
        
        if((flowerbed[0] == 0 && flowerbed[1]!=1))
            {
                flowerbed[0] = 1;
                c=c-1;
                if(c==0)
                {
                    return true;
                }
            }
        
        for(int i=1;i<flowerbed.length-1;i++)
        {
                if(flowerbed[i]==0)
                {
                    if((flowerbed[i-1]!=1 && flowerbed[i+1]!=1))
                    {
                        flowerbed[i] = 1;
                        c = c-1;   
                        if(c==0)
                        {
                            return true;
                        }

                    }
                    //go to next iteration 
                }
        }
        
   if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2]== 0) 
    {
            flowerbed[flowerbed.length - 1] = 1;
            c--;
            if (c == 0) {
                return true;
            }
        }
        

       return  false;
        
    }
}
             
            