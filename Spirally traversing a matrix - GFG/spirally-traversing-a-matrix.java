// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
         ArrayList<Integer> result=new ArrayList<>();
        int rowBegin=0, colBegin=0;
        int rowEnd=r-1, colEnd=c-1;
        while(rowBegin<=rowEnd && colBegin<=colEnd){
            for(int i=colBegin;i<=colEnd;i++){
                result.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            for(int i=rowBegin;i<=rowEnd;i++){
                result.add(matrix[i][colEnd]);
            }
            colEnd--;           
            if(rowBegin>rowEnd || colBegin>colEnd){
                return result;
            }
            for(int i=colEnd;i>=colBegin;i--){
                result.add(matrix[rowEnd][i]);
            }
            rowEnd--;
            for(int i=rowEnd;i>=rowBegin;i--){
                result.add(matrix[i][colBegin]);
            }
            colBegin++;
        }
        return result;
    }
}
