// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    
    public static int count(int [] nums, int mid)
    {
        // function to calculate number of elements less than equal to mid
            int cnt = 0;
              
            for(int i = 0; i < nums.length; i++)
               if(nums[i] <= mid)
                  cnt++;
              
            return cnt;
    }
    
    public static int kthSmallest(int[] nums, int l, int r, int k) 
    { 
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        //calculate minimum and maximum the array.
        for(int i = 0; i < nums.length; i++)
        {
            low = Math.min(low, nums[i]);
            high = Math.max(high, nums[i]);
        }
        //Our answer range lies between minimum and maximum element of the array on which Binary Search is Applied
        while(low < high)
        {
            int mid = low + (high - low) / 2;
           /*if the count of number of elements in the array less than equal to mid is less than k
             then increase the number. Otherwise decrement the number and try to find a better answer.
           */
            if(count(nums, mid) < k)
               low = mid + 1;
                 
            else
                high = mid;
        }
          
        return low;
    } 
}
