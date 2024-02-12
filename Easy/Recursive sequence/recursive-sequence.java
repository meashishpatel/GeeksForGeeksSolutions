//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.sequence(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long sequence(int n){
        // code here
        return compute(0L, (long)n, 1L, 1L);
    }
    
    static long compute(long ans, long n, long i, long k){
        long m = 1000000007L;
        if(n<i){
            return ans;
        }
        long product = 1;
        for(long j = 1; j<=i; j++){
            product = ((product%m) * (k%m))%m;
            k++;
        }
        
        return compute(((ans%m)+(product%m))%m, n, i+1, k);
    }
}