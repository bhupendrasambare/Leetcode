// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            int s = Integer.parseInt(S[2]);
            int d = Integer.parseInt(S[3]);
            int[][] edges = new int[m][2];
            for(int i = 0; i < m; i++){
                String[] S1 = br.readLine().trim().split(" ");
                edges[i][0] = Integer.parseInt(S1[0]);
                edges[i][1] = Integer.parseInt(S1[1]);
            }
            Solution obj = new Solution();
            int ans = obj.possible_paths(edges, n, s, d);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int possible_paths(int[][] edges, int n, int s, int d)
    {
        // Code here 
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>() ;
        for(int i = 0 ; i < n ; i++) {
            hm.put( i , new ArrayList<Integer>() ) ;
        }
        for(int i = 0 ; i < edges.length ; i++) {
            hm.get(edges[i][0]).add(edges[i][1]) ;
        }
        boolean vis[] = new boolean[n] ; 
        return dfs( hm , s , d ,vis) ;
    }
    
    public int dfs( HashMap<Integer,ArrayList<Integer>>hm , int src ,int dstn ,boolean vis[]){
        int count = 0 ;
        if(src == dstn) {
            return 1 ;
        }
        vis[src] = true ;
        for(int i : hm.get(src)) {
            if( !vis[i] ) {
                count+= dfs(hm,i,dstn,vis) ;
            }
        }
        vis[src] = false ;
        return count ;
    }
}