//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            int M = Integer.parseInt(read.readLine());
            int mat[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    mat[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.minRow(mat));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minRow(int mat[][]) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        for(int i = 0; i < n; i++)
        {
            Arrays.sort(mat[i]);
        }
        
        int countMin = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 0; i < n; i++)
        {
            int[] arr = mat[i];
            int countOnes = m - lowerBound(arr, m, 1);
            
            if(countOnes < countMin)
            {
                countMin = countOnes;
                index = i;
            }
        }
        return index + 1;
    }
    public static int lowerBound(int[] arr, int n, int target)
    {
        int low = 0;
        int high = n - 1;
        int ans = n;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(arr[mid] >= target)
            {
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }
};