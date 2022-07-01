class Solution {
    public int maxProduct(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int ans =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                max = max ^ min;
                min = max ^ min;
                max = max ^ min;
            }
            max = Math.max(arr[i],max * arr[i]);
            min = Math.min(arr[i],min * arr[i]);
            
            ans = Math.max(ans,max);
        }
        return ans;
    }
}