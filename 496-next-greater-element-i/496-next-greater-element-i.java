class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i]=-1;
            inner:for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    j++;
                    while(j<nums2.length){
                        if(nums2[j] > nums1[i]){
                            result[i] = nums2[j];
                            break inner;
                        }
                        j++;
                    }
                }
            }
        }
        return result;
    }
}