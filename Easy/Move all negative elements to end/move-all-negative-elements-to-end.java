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
            PrintWriter ot = new  PrintWriter(System.out);
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            ot.print(a[i]+" ");
            
            ot.println();
        }
        ot.close();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        ArrayList<Integer> Positive = new ArrayList<>();
        ArrayList<Integer> Negative = new ArrayList<>();
        
        // Find all positive and negative elements 
        for(int i=0; i<n; i++){
            if(arr[i]>=0){
                Positive.add(arr[i]);
            }
            else {
                Negative.add(arr[i]);
            }
        }
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        // fill exta element
        while(i<Positive.size()){
            arr[k++] = Positive.get(i++);
        }
         while(j<Negative.size()){
            arr[k++] = Negative.get(j++);
        }
    }
}