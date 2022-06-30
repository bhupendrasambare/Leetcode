// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int nums[], int n)
    {
        // your code here
        int count = 0, candidate = -1;
     
        // Finding majority candidate
        for (int index = 0; index < nums.length; index++) {
          if (count == 0) {
            candidate = nums[index];
            count = 1;
          }
          else {
            if (nums[index] == candidate)
              count++;
            else
              count--;
          }
        }
     
        // Checking if majority candidate occurs more than
        // n/2 times
        count = 0;
        for (int index = 0; index < nums.length; index++) {
          if (nums[index] == candidate)
            count++;
        }
        if (count > (nums.length / 2))
          return candidate;
        return -1;
    }
}