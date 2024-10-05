//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        if(arr.length == 1)  return arr[0];
        
        String ans = "";
        
        Arrays.sort(arr);
        
        String s1 = arr[0];
        String s2 = arr[arr.length - 1];
        int x = 0;
        int y = 0;
        
        while(x < s1.length() && y < s2.length())
        {
            if(s1.charAt(x) == s2.charAt(y))
            {
                ans += s1.charAt(x);
                x++;
                y++;
            }
            else
            {
                break;
            }
        }
        if(ans.length() == 0) return "-1";
        return ans;
    }
}