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
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
       Queue<Long> queue = new LinkedList<Long>();
       ArrayList<Long> ans = new ArrayList<>();
       
       for(int i = 0; i < K - 1; i++){
           if(A[i] < 0){
               queue.offer(A[i]);
           }
       }
       
       for(int i = K - 1; i < N; i++){
           if(A[i] < 0){
               queue.offer(A[i]);
           }
           if(!queue.isEmpty()){
               ans.add(queue.peek());
               if(queue.peek() == A[i - K + 1]){
                    queue.poll();
                }
           }
           else{
               ans.add(0L);
           }
       }
       return ans.stream().mapToLong(Long::longValue).toArray();
    }
}
