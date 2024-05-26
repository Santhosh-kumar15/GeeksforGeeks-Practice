//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {
        int length = s.length();
        if(length%2 != 0)
            return -1;
            
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<length;i++)
        {
            if(s.charAt(i) == '}' && !stack.isEmpty())
            {
                if(stack.peek() == '{')
                    stack.pop();
                else
                    stack.add(s.charAt(i));
            }
            else
            {
                stack.add(s.charAt(i));
            }
        }
        int stackLength = stack.size();
        
        int n=0;
        while(!stack.isEmpty() && stack.peek() == '{')
        {
            n++;
            stack.pop();
        }
        return(stackLength/2 + n%2);
    }
}