class Solution {
    public int maxSubArray(int[] nums) {
        //Kadane's algo in notes
        // int maxSum =nums[0];
        // int current =0;
        // for(int i=0;i<nums.length;i++){
        //     current +=nums[i];
        //     if(current>maxSum){
        //         maxSum = current;
        //     }
        //     if(current <0){
        //         current =0;
        //     }
        // }
        // return maxSum;
        int m = Integer.MIN_VALUE;
        int buffer = 0;
        for(int i : nums) {
            buffer += i;
            if(buffer > m) m = buffer;
            if(buffer < 0) buffer = 0;
        }
        return m;
    }
}