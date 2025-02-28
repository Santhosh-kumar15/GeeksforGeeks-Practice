/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
		{
		    int N = sc.nextInt();
		    int[] arr = new int[N];
		    for(int j = 0; j < N; j++)
		    {
		        arr[j] = sc.nextInt();
		    }
		    sort(arr);
		}
	}
	
	public static void sort(int[] arr)
	{
	    HashMap<Integer, Integer> map = new HashMap<>();
	    List<Integer> list = new ArrayList<>();
	    for(int i = 0; i < arr.length; i++)
	    {
	        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
	        list.add(arr[i]);
	    }
	    Collections.sort(list, (n1,n2) ->{
	        int freq1 = map.get(n1);
	        int freq2 = map.get(n2);
	        if(freq1 != freq2) return freq2 - freq1;
	        return n1 - n2;
	    });
	    
	    for(int i = 0; i < list.size(); i++)
	    {
	        System.out.print(list.get(i) + " ");
	    }
	    System.out.println();
	}
}