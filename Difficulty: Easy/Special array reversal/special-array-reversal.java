//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.reverse(s));                        
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String reverse(String str)
    {
        //complete the function here
        int left = 0;
        int right = str.length() - 1;
        char[] arr = str.toCharArray();
        while(left < right)
        {
            if(Character.isLetter(arr[left]) && Character.isLetter(arr[right]))
            {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if(!(Character.isLetter(arr[left])))
                left++;
            else 
                right--;
        }
        return new String(arr);
    }
}