class Solution {
    public int candy(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        
        for(int i=1;i<n;i++){
            if(arr[i] > arr[i-1]){
                left[i] = left[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(arr[i+1] < arr[i]){
                right[i] = right[i+1]+1;
            }
        }
        int ans =0;
        for(int i=0;i<n;i++){
            ans += Math.max(left[i],right[i]);
        }
        return ans;
    }
}