class Solution {
    
    public static boolean isFissable(int[] arr,int k,int res){
        int ship=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>res){
                ship++;
                sum = arr[i];
            }else{
                sum+=arr[i];
            }
        }
        return ship<=k;
    }
    
    public int shipWithinDays(int[] arr, int k) {
        int min=Integer.MAX_VALUE+1;
        int max = 0;
        int res=0;
        for(int i=0;i<arr.length;i++){
            min = Math.max(min,arr[i]);
            max +=arr[i];
        }
        while(min<=max){
            int mid = (min+max)/2;
            if(isFissable(arr,k,mid)){
                res = mid;
                max = mid-1;
            }else{
                min = mid+1;
            }
        }
        return res;
    }
}