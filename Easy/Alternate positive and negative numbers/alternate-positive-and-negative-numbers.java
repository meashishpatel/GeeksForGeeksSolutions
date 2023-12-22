//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    void rearrange(int arr[], int n) {
        // code here
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
        
        // Put all elements One by One
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<Positive.size() && j<Negative.size()){
            arr[k++] = Positive.get(i++);
            arr[k++] = Negative.get(j++);
        }
        
        // fill exta element
        while(i<Positive.size()){
            arr[k++] = Positive.get(i++);
        }
         while(j<Negative.size()){
            arr[k++] = Negative.get(j++);
        }
    }
}


