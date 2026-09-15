class Solution {
    public boolean isPalindrome(int x) {
    
    int num = x;
    int reverse = 0;
    while (num > 0) {
        int d  = num % 10;
        reverse = d + 10* reverse;
        num = num/10;
    }

    if(reverse == x){
        return true;
    } else {
        return false;
    }
    
    }
}