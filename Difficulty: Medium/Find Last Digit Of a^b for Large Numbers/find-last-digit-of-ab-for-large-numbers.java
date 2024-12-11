//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            String a = S[0];
            String b = S[1];

            Solution ob = new Solution();
            System.out.println(ob.getLastDigit(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int getLastDigit(String a, String b) {
        // code here
        int num1 = a.charAt(a.length() - 1) - '0';
        if(b.equals("0"))
            return 1;
        int num2 = 0;
        for(int i = 0; i < b.length(); i++)
        {
            num2 = (num2 * 10 +( b.charAt(i) - '0')) % 4;
        }
        if(num2 == 0)
            num2 = 4;
        int result = (int) Math.pow(num1, num2) % 10;
        return result;
    }
};