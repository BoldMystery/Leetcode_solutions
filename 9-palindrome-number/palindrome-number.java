class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if(x % 10 == 0 && x != 0){
            return false;
        }
        int palindrome = 0;
        int temp = x;
        while(temp > 0){
            int digit = temp % 10;

            palindrome = (palindrome * 10) + digit;

            temp /= 10;
        }

        return palindrome == x ? true : false;
    }
}