// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().removals(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int removals(int[] arr, int n, int k) {
        // code here
        int ans = 0;
        Arrays.sort(arr);
        
        for(int l = 0; l < n; l++) {
            for(int r = l + 1; r <= n; r++) {
                if(r == n || arr[r] - arr[l] > k) {
                    ans = Math.max(ans, (r - l));
                    break;
                }
            }
        }
        
        return n - ans;
    }
}