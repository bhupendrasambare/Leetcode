class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i]=-1;
            Stack<Integer> temp = new Stack<>();
            for(int j=nums2.length-1;j>=0;j--){
                if(nums2[j] > nums1[i]){
                    temp.push(nums2[j]);
                }
                if(nums2[j] == nums1[i]){
                    if(temp.isEmpty()){
                        result[i] = -1;
                    }else{
                        result[i] = temp.pop();
                    }
                    break;
                }
            }
        }
        return result;
    }
}