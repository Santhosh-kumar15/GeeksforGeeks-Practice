//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            char res = ob.firstRep(s);
            if (res == '#')
                System.out.println(-1);
            else
                System.out.println(res);
             
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    char firstRep(String S)
    {
        // your code here
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
        for(char c: S.toCharArray())
        {
            charCount.put(c, charCount.getOrDefault(c, 0)+1);
        }
        
        for(Map.Entry<Character, Integer> entry: charCount.entrySet())
        {
            if(entry.getValue()>1)
                return entry.getKey();
        }
        return '#';
    }
}