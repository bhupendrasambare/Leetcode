class Solution {
    
    public int search(int[] nums, int target) {
        if(nums.length == 0 || nums == null)
            return -1;
        int s = 0;
        int end = nums.length-1;
        while(s<=end){
            int mid = s + (end - s)/2;
            if(nums[mid] == target){
              return mid;   
            }
            if(nums[mid]<target){
                 s = mid+1;
            }
            if(nums[mid]>target){
                 end = mid-1;      
            } 
        }
        return -1;
    }
}