//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            
            int  k = Integer.parseInt(read.readLine());
            int  n = Integer.parseInt(read.readLine());
            int arr[][] = new int[n][n];
            String input_line1[] = read.readLine().trim().split("\\s+");
            int c = 0;
            for(int i=0;i<n;i++){
                for(int j = 0;j<n;j++){
                    arr[i][j] = Integer.parseInt(input_line1[c]);
                    c++;
                }
            }
            Solution obj = new Solution();
            System.out.println(obj.numberOfPath(n, k, arr));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    long numberOfPath(int n, int k, int [][]arr) {
        
        long dp[][][] = new long[n][n][k+1];
        for(long[][] row1 : dp){
            for(long[] row : row1){
                Arrays.fill(row , -1);
            }
        }
        
        return solve(n-1 , n-1 , k , arr , dp);
    }
    long solve(int i, int j, int k ,  int [][]arr , long dp[][][])
    {
        if(i < 0 || j < 0 || k < 0) return 0;
        if(i == 0 && j == 0 ) {
            if(k == arr[i][j]) return 1;
            else return 0;
        }
        
        if(dp[i][j][k] != -1) return dp[i][j][k];
        
        long left = solve(i , j - 1 , k - arr[i][j] , arr , dp);
        long up = solve(i - 1 , j , k - arr[i][j] , arr , dp);
        
        return dp[i][j][k] = left + up;
    }
}