//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] mat = new int[n][n];
            String[] S = br.readLine().trim().split(" ");
            int i = 0;
            int j = 0;
            for(int k = 0; k < S.length; k++){
                mat[i][j] = Integer.parseInt(S[k]);
                j++;
                if(j == n){
                    i++;
                    j = 0;
                }
            }
            Solution obj = new Solution();
            int[] ans = obj.matrixDiagonally(mat);
            for(int it = 0; it < ans.length; it++){
                System.out.print(ans[it] + " ");
            }
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        int n = mat.length;
        int i = 0;
        int j = 0;
        int count = 0;
        int[] ans = new int[n * n];
        int index = 0;
        int up = 1;
        while(count < n * n)
        {
            if(up == 1)
            {
                while(i >= 0 && j < n)
                {
                    ans[index++] = mat[i][j];
                    count++;
                    if(j == n - 1)
                    {
                        i++;
                        break;
                    }
                    else if(i == 0)
                    {
                        j++;
                        break;
                    }
                    i--;
                    j++;
                }
                up ^= 1;
            }
            else
            {
                while(i < n && j >= 0)
                {
                    ans[index++] = mat[i][j];
                    count++;
                    if(i == n - 1)
                    {
                        j++;
                        break;
                    }
                    else if(j == 0)
                    {
                        i++;
                        break;
                    }
                    i++;
                    j--;
                }
                up ^= 1;
            }
        }
        return ans;
    }
}