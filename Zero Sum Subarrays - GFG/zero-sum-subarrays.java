// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    
    public static long findSubarray(long[] arr ,int n) 
    {
        long cumSum[]=new long[n];
        cumSum[0]=arr[0];
        for(int i=1;i<n;i++){
           cumSum[i]+=arr[i]+cumSum[i-1];
        }
        HashMap<Long,Integer> hm=new HashMap<Long,Integer>();
        for(int i=0;i<n;i++){
           if(!hm.containsKey(cumSum[i])){
               hm.put(cumSum[i],1);
           }
           else
           {
               hm.put(cumSum[i],hm.get(cumSum[i])+1);
           }
        }
        int ans=0;
        for(int i=0;i<n;i++){
           if(hm.containsKey(cumSum[i])&& hm.get(cumSum[i])>1&& cumSum[i]!=0){
               int freq=hm.get(cumSum[i]);
               ans+=((freq)*(freq-1))/2;
               hm.remove(cumSum[i]);
           }
           if(hm.containsKey(cumSum[i])&&cumSum[i]==0){
            int freq=hm.get(cumSum[i]);
               ans+=((freq)*(freq-1))/2;
               ans+=freq;
               hm.remove(cumSum[i]);
           }
           
       }
       return ans;

    }
     
}