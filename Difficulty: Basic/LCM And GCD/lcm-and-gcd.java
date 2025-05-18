//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a;
            a = Integer.parseInt(br.readLine());

            int b;
            b = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int[] ans = obj.lcmAndGcd(a, b);
            System.out.println(ans[0] + " " + ans[1]);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int gcdVal = gcd(a,b);
        int lcmVal = lcm(a,b);
        return new int[]{lcmVal, gcdVal};
    }
    
    public static int gcd(int a, int b)
    {
        int rem = 1;
        int dividend;
        int divisor;
        if(a > b)
        {
            dividend = a;
            divisor = b;
        }
        else
        {
            dividend = b;
            divisor = a;
        }
        while(rem != 0)
        {
            rem = dividend %divisor;
            if(rem != 0)
            {
                dividend = divisor;
                divisor = rem;
            }
        }
        return divisor;
    }
    
    public static int lcm(int a, int b)
    {
        return Math.abs(a*b)/gcd(a,b);
    }
}


//{ Driver Code Starts.

// } Driver Code Ends