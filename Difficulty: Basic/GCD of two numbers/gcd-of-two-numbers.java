//{ Driver Code Starts
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
            int res = obj.gcd(a, b);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int gcd(int a, int b) {
        // code here
        int rem = 1;
        int dividend;
        int divisor;
        if(a > b)
        {
            dividend = a;
            divisor = b;
        }
        else{
            dividend = b;
            divisor = a;
        }
        
        while(rem != 0)
        {
            rem = dividend % divisor;
            if(rem != 0)
            {
                dividend = divisor;
                divisor = rem;
            }
        }
        return divisor;
    }
}
