class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        return x == reverse(x) ? true:false;
        
    }
    
    private int reverse(int x){
        //125 --> 521
        //negative is handled
        int reversed=0;
        while(x!=0){
            int digit = x%10;
            reversed = reversed*10 + digit;
            x/=10;
            
        }
        
        return reversed;
    }
}