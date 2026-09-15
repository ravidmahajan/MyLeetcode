class Solution {
    public int reverse(int x) {
        int num = x;
        long reverse = 0;
        while(num != 0) {
            int d = num%10;
            reverse = d + 10* reverse;
            num = num/10;
        }

         if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reverse;
    }
}