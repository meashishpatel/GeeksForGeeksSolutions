//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends


//********REMEMBER THIS***************
//String[] array = S.split("\\."); beacause . is a special character
//String result = String.join(".", array);

class Solution 
{
    // Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String[] array = S.split("\\.");

        int i = array.length - 1;
        int j = 0;

        while (i > j) {
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i--;
            j++;
        }

        String result = String.join(".", array);
        return result;
    }
}
