// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
   {
        // code here 
        
        int i=0;
       int cel = -1,cn=0;
       for(int[] e : M){
           int sum = 0;
           for(int ele : e)
               sum+=ele;
           i++;
           if(sum==0){
               cel = i-1;
               cn++;
           }
       }
       if(cn>1)    
           return -1;
       return cel;
   }
}