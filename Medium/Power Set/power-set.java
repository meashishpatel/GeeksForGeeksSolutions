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
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public List<String> AllPossibleStrings(String str)
    {
        List<String> res = AllPossibleStringsHelper(str);
        res.remove("");
        res.sort((s1,s2)->s1.compareTo(s2));
        return res;
    }
    public List<String> AllPossibleStringsHelper(String str)
    {
        if(str.length()==0)
		{
			List<String> subset = new ArrayList<>();
			subset.add("");
			return subset;
		}
		List<String> subset = AllPossibleStringsHelper(str.substring(1));
		
		List<String> newSubsets = new ArrayList<String>();
		
		for(int i=0;i<subset.size();i++)
		{
			newSubsets.add(subset.get(i));
			newSubsets.add(str.charAt(0)+subset.get(i));
		}
		
		return newSubsets;
    }
}