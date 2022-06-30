// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int current=0, i=0,j=0;
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(i=0;i<arr.length;i++){
            
            current = arr[i];
            
            for(j=i+1;j<arr.length;j++)
            {
                if(current == s){
                        ans.add(i+1);
                        ans.add(j);
                        return ans;
                }
                if(current > s){
                    break;
                }
                current += arr[j];
            }
            
            if(current == s){
                    ans.add(i+1);
                    ans.add(j);
                    return ans;
            }
        }
        ans.add(-1);
        return ans;
    }
}