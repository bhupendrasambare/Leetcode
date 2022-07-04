class Solution {
    public int subarraySum(int[] nums, int k) {
       Map<Integer, Integer> hp = new HashMap<>();
        int subArrFound = 0, currSum = 0;
        
        for (int i = 0 ; i < nums.length; i++) {
            currSum += nums[i];
            int key = currSum - k;
            
            if(key == 0) {
                subArrFound++;
            }
            
            if(hp.containsKey(key)) {
                subArrFound += hp.get(key);
            }
            
            hp.put(currSum, hp.getOrDefault(currSum, 0) + 1);
        }
        
        return subArrFound;
    }
}