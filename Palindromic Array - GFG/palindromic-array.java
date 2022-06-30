// { Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
    
    public static int getReverse(int num){
        int dig;
        int rev = 0;
        while (num > 0)
        {
            dig = num % 10;
            rev = rev * 10 + dig;
            num = num / 10;
        }
        return rev;
    }
    
	public static int palinArray(int[] a, int n)
   {
          for(int i=0;i<n;i++){
              if(a[i] != getReverse(a[i])){
                  return 0;
              }
          }
          return 1;
   }
}