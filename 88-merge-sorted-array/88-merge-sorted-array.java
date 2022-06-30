class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int k = nums1.length - 1;
        
        while(k>=0 && nums1[k] == 0)
            k--;
        
        int j = 0;
        
        while(j<nums2.length)
            nums1[++k] = nums2[j++];
        
       Arrays.sort(nums1);
    }
}