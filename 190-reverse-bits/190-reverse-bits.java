public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reversed = 0;
        //traversal bit by bit and reverse
        //note: the input is a bianry string of length 32
        for(int i = 0; i < 32; i++){
            int bit = (n >> i) & 1;//get the last bit by right shift and then & 1
            //since bit is the ith bit in the orginial n
            //so it will be the 31 -i bit in the reversed n
            reversed = reversed | bit << (31 - i);
        }
        return reversed;
    }
}