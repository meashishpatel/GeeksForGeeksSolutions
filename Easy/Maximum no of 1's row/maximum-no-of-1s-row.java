//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][]arr = new int[n][m];
            
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < m; ++j)
                    arr[i][j] = sc.nextInt ();

    		System.out.println (new Sol().maxOnes (arr, n, m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        int currCount = 0;
        int maxCount = 0;
        int row = 0;
        int i,j;
        for( i = 0; i < N; i++){
            currCount = 0;
            for( j = 0; j < M; j++){
                if(Mat[i][j] == 1)  currCount++;
            }
            if(currCount>maxCount){
                maxCount = currCount;
                row = i;
            }
        }
        
        if(maxCount == 0)   return -1;
        
        return row;
    }
}