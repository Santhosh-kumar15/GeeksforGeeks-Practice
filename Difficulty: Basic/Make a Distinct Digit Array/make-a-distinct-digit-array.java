//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = sc.nextInt();
            Solution ob = new Solution();
            int[] ans = ob.common_digits(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] common_digits(int[] nums)
    {
        // code here
        HashSet<Integer> digits = new HashSet<>();
    
        for(int i = 0; i < nums.length; i++)
        {
            int num = nums[i];
            while(num != 0)
            {
                int digit = num % 10;
                if(!(digits.contains(digit)))
                {
                    digits.add(digit);
                }
                num = num / 10;
            }
        }
        List<Integer> list = new ArrayList<>(digits);
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        {
            result[i] = list.get(i);
        }
        return result;
    }
}