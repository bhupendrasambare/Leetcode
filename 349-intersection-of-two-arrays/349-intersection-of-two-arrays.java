class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> ans = new HashSet<>();
        Set<Integer> arr = new HashSet<>();
        for(int i:nums1){
            arr.add(i);
        }
        for(int i:nums2){
            if(arr.contains(i)){
                ans.add(i);
            }
        }
        int[] a = new int[ans.size()];
        int pos=0;
        for(int z:ans){
            a[pos] = z;
            pos++;
        }
        return a;
    }
}