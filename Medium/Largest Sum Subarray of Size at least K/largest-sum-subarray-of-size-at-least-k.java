//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            System.out.println(obj.maxSumWithK(a, n, k));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution 
{
    public long maxSumWithK(long a[], long n, long k)
    {
        long maxi = Long.MIN_VALUE, sum = 0, prevSum = 0;
        int j = 0;
        
        for(int i = 0; i < k; i++)  
            sum += a[i];
            
        maxi = Math.max(maxi, sum);
        for(int i = (int) k; i < n; i++)
        {
            sum += a[i];
            prevSum += a[j++];
            maxi = Math.max(maxi, sum);
            
            if(prevSum < 0) 
            {
                sum -= prevSum;
                maxi = Math.max(maxi, sum);
                prevSum = 0;
            }
        }
        
        return maxi;       
    }
}