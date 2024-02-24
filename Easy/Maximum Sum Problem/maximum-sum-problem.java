//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSum(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution{
    public int maxSum(int n) { 
        int ans[] = new int[n+1];
        for(int i = 1 ; i <= n ; i++)
        ans[i] = Math.max(i , ans[i/2]+ans[i/3]+ans[i/4]);
        return ans[n];
    }
}