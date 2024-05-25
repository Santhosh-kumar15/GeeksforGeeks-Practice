//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
        int num;
        int result = 0;
        int nc = 0;
	   for(int i=0;i<s.length();i++)
	   {
	       num = s.charAt(i) - '0';
	       if(i == 0 && s.charAt(i) == '-')
	       {
	           nc++;
	           continue;
	       }
           if(num >= 0 && num <= 9)
           {
               result = result*10+num;
           }
           else
           {
               return -1;
           }
	   }
	   if(nc == 1)
	   {
	       int val = result*2;
	       result = result-val;
	   }
	   return result;
    }
}
