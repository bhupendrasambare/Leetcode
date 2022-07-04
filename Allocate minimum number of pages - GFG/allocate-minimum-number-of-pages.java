// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    
    public static boolean isBalanced(int[] arr,int k,int mid){
        int book=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>mid){
                book++;
                sum=arr[i];
            }else{
                sum+=arr[i];
            }
        }
        return book<=k;
    }
    
    //Function to find minimum number of pages.
    public static int findPages(int[]arr,int N,int k)
    {
        //Your code here
        int min=Integer.MAX_VALUE+1;
        int max =0;
        int res=0;
        for(int i=0;i<N;i++){
            min = Math.max(min,arr[i]);
            max += arr[i];
        }
        while(min<=max){
            int mid = (min+max)/2;
            if(isBalanced(arr,k,mid)){
                max = mid-1;
                res=mid;
            }else{
                min = mid+1;
            }
        }
        return res;
    }
};