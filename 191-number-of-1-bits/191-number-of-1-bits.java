public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i) == '1')
            {
                count++;
            }
        }
        return count;
    }
}