//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPrime(N));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution{
    static int isPrime(int N){
        // code here
        double until = Math.ceil(Math.sqrt(N));
        if(N <= 1)
            return 0;
        if(N == 2 || N == 3)
            return 1;
        if(N % 2 == 0 || N % 3 == 0)
            return 0;
        for(int i = 5; i <= until; i+=2)
        {
            if(N % i == 0)
                return 0;
        }
        return 1;
    }
}