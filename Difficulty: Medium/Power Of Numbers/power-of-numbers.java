//{ Driver Code Starts
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // test cases

        Solution ob = new Solution();

        while (T-- > 0) {
            int n = sc.nextInt(); // input N
            int ans = ob.reverseExponentiation(n);
            System.out.println(ans);
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int rev = reverse(n);
        int result = (int)Math.pow(n, rev);
        return result;
    }
    
    public static int reverse(int num)
    {
        int rev = 0;
        while(num != 0)
        {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }
}
