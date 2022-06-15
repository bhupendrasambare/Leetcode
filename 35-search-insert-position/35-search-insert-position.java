class Solution {
    public int searchInsert(int[] nums, int target) {
        return findElement(nums,0,nums.length-1,target);
    }
    public int findElement(int[] nums, int start, int end, int target) {
        if(start >= end) {
            if(start < nums.length && nums[start] < target)
                return start+1;
            else
                return start;
        }
        
        int mid = (int) (start+end)/2;
        int ans = -1;
        if(nums[mid] < target) {
            ans = findElement(nums, mid+1, end, target);
        } else if(nums[mid] == target) {
            ans = mid;
        } else {
            ans = findElement(nums, 0, mid-1, target);
        }
        
        return ans;
    }
}