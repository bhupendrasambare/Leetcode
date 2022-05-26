class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!arr.contains(nums[i])){
                arr.add(nums[i]);
            }else{
                return nums[i];
            }
        }
        return 1;
    }
}