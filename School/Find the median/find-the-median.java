//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v  = new int[n];
            for(int  i = 0; i < n; i++)
                v[i] = Integer.parseInt(S[i]);
            Solution ob = new Solution();
            int ans = ob.find_median(v);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public int find_median(int[] v) {
        int size = v.length;
        int median;

        Arrays.sort(v);

        if (size % 2 == 0) {
            int a = v[size / 2];
            int b = v[(size / 2) - 1];
            median = (a + b) / 2;
        } else {
            median = v[(size + 1) / 2 - 1];
        }

        return median;
    }
}
