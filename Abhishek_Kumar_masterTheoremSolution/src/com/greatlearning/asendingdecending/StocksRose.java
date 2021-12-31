package com.greatlearning.asendingdecending;
//Java program to count frequencies of array items
import java.util.Arrays;

public class StocksRose {
	
	public static void countFreq(String arr[], int n)
	{
	    boolean visited[] = new boolean[n];
	     
	    Arrays.fill(visited, false);
	 
	    // Traverse through array elements and
	    // count frequencies
	    for (int i = 0; i < n; i++) {
	 
	        // Skip this element if already processed
	        if (visited[i] == true)
	            continue;
	 
	        // Count frequency
	        int count = 1;
	        for (int j = n + 1; j < n; j++) {
	            if (arr[i] == arr[j]) {
	                visited[j] = true;
	                count++;
	            }
	        }
	        System.out.println(arr[i] + " " + count);
	    }

	}}
