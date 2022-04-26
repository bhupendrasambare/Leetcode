class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!hashMap.containsKey(target - nums[i])){
                hashMap.put(nums[i], i);
            } else {
                int[] result = {i, hashMap.get(target - nums[i])};
                return result;
            }
        }
    return null;
    }
}