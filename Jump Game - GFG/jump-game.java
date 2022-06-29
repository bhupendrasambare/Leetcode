// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S1[] = read.readLine().split(" ");
            
            int[] A = new int[N];
            
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S1[i]);

            Solution ob = new Solution();
            System.out.println(ob.canReach(A,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public static boolean solve(int i,int nums[], int n){
        
        if(i==n-1) return true;
        int reachable=i+nums[i];
        
        for(int k=i+1;k<=reachable;k++){
                  if(solve(k,nums,n)){
                return true;
            }      
        }
        return false;
    }
    
    static int canReach(int[] A, int N) {
        // code here
        return (solve(0, A, N))?1:0;
    }
};