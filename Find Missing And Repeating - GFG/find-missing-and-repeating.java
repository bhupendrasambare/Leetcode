// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int num=1;
        int res[]=new int[2];
        int arr1[]=new int[n-1];
        int i=0,j=0;
        for(i=0;i<n;i++)
        {
            if(i<n-1 && arr[i]==arr[i+1])
            {
               res[0]=arr[i]; continue;
            }
            arr1[j]=arr[i];
            j++;
        }
        
        for(i=0;i<n-1 && arr1[i]==num;i++,num++);
            res[1]=num;
        return res;
    }
}