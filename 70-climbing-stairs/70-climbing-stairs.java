class Solution {
    public int climbStairs(int n) {
        int result = 0;
        int first = 0, last = 1;

        for (int i = 0; i < n; i++) {
            result = first + last;
            first = last;
            last = result;
        }

       return result;
    }
}