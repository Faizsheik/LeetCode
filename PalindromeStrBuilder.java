

class PalindromeStrBuilder 
{
    public boolean isPalindrome(int x) 
    {
        int revdig = 0;
        int num = x;
        int rem=0;
        while(num>0)
        {
              rem = num%10;
             revdig = (revdig * 10) + rem;
             num = num/10;
        }
        
        return revdig == x;
         
    }
}