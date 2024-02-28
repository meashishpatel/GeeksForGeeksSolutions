//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S=read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.DivisibleByEight(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int DivisibleByEight(String s){
        if(s.length()<=4){
            int temp=Integer.parseInt(s);
            return temp%8==0?1:-1;
        }else {
            int len=s.length();
            int temp=Integer.parseInt(s.substring(len-3));
             return temp%8==0?1:-1;
        }
    }
}