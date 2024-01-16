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
            String input_line[] = read.readLine().trim().split("\\s+");
            int m = Integer.parseInt(input_line[0]);
            int n = Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.numberSequence(m, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    static int numberSequence(int m, int n) {
        int[][] dp = new int[n+1][m+1];
        
        for(int i=0;i<=m;i++) dp[0][i]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                dp[i][j]=dp[i-1][j/2]+dp[i][j-1];
            }
        }
        return dp[n][m];
    }
}