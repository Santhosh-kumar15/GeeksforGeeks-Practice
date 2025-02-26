//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            int a[] = new int[inputArray.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(inputArray[i]);

            Solution ob = new Solution();
            ob.sort012(a);

            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}


// } Driver Code Ends

class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int mid = 0;
        int low = 0;
        int high = arr.length - 1;
        while(mid <= high)
        {
            if(arr[mid] == 0)
            {
                swap(arr, mid, low);
                mid++;
                low++;
            }
            else if(arr[mid] == 1)
            {
                mid++;
            }
            else if(arr[mid] == 2)
            {
                swap(arr, mid, high);
                high--;
            }
        }
    }
    public static void swap(int[] arr, int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}


//{ Driver Code Starts.
// } Driver Code Ends