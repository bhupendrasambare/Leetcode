class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=0;
        int[] arr = {i,j};
        for(i=0;i<nums.length;i++){
            for(j=0;j<nums.length;j++){
                if(i!=j && (nums[i]+ nums[j]) == target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}