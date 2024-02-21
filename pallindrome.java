class Solution {

    public static boolean isPalindrome(int x) 
    { 
        int rev_num = 0;
        int y=x;
        while (x > 0) { 
            rev_num = rev_num * 10 + x % 10; 
            x = x / 10; 
        } 
        return rev_num==y; 
    }  
}