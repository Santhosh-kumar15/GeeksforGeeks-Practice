//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isTwistedPrime(N));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isTwistedPrime(int N) {
        // code here
        int reverseNum = 0;
        int temp = N;
        while(N != 0)
        {
            int rem = N % 10;
            reverseNum = reverseNum * 10 + rem;
            N = N / 10;
        }
        if(isPrime(temp) && isPrime(reverseNum))
            return 1;
        return 0;
    }
    public static boolean isPrime(int n)
    {
        if(n == 1 || n == 0)
            return false;
        if(n == 2 || n == 3)
            return true;
        if(n % 2 == 0 || n % 3 == 0)
            return false;
        for(int i = 5; i * i <= n; i += 2)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}