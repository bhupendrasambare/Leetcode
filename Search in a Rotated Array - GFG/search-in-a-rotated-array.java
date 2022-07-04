// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            
            System.out.println(new Solution().search(A, 0, n - 1, key));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    int search(int arr[], int l, int h, int key)
    {
        // Complete this function
        int low=0;
        int high = arr.length-1;
        int mid=0;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid]==key) return mid;
            
            if(arr[low] <=arr[mid]){
                if(key >= arr[low] && key<arr[mid]){
                    high = mid-1;
                }else{
                    low= mid+1;
                }
            }
            else{
                if(key <= arr[high] && key >arr[mid]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}