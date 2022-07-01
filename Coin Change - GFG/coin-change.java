// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int Arr[] = new int[m];
            for (int i = 0; i < m; i++) Arr[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(Arr, m, n));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    
    public static long countCheck(int S[],int target,int ind, long dp[][])
    {
        if(ind==0) {
            long ans=target%S[ind]==0?1:0;
            return ans;
        }
        if(dp[ind][target]!=-1) return dp[ind][target];
        
        long nt=countCheck(S,target,ind-1,dp);
        long t=0;
        if(target-S[ind]>=0)
        t=countCheck(S,target-S[ind],ind,dp);
        
        return dp[ind][target]=t+nt;
    }
    
    public long count(int S[], int m, int n) {
        // code here.
        long dp[][]=new long[m][n+1];
        for(long row[]:dp)
        Arrays.fill(row,-1);
        
        return countCheck(S,n,m-1,dp);
    }
}