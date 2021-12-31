package com.greatlearning.asendingdecending;

public class DesendingSorting {
	
	static void swap(double[] arr, int i, int j)
	{
	    double temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	  
	/* This function takes last element as pivot, places
	   the pivot element at its correct position in sorted
	   array, and places all smaller (smaller than pivot)
	   to left of pivot and all greater elements to right
	   of pivot */
	static int partition(double[] arr, int low, int high)
	{
	      
	    // pivot
	    double pivot = arr[high]; 
	      
	    // Index of smaller element and
	    // indicates the right position
	    // of pivot found so far
	    int i = (low - 1); 
	  
	    for(int j = low; j <= high - 1; j++)
	    {
	          
	        // If current element is smaller 
	        // than the pivot
	        if (arr[j] < pivot) 
	        {
	              
	            // Increment index of 
	            // smaller element
	            i++; 
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, high);
	    return (i + 1);
	}
	  
	/* The main function that implements QuickSort
	          arr[] --> Array to be sorted,
	          low --> Starting index,
	          high --> Ending index
	 */
	public static void quickSortde(double[] arr, int low, int high)
	{
	    if (low < high) 
	    {
	          
	        // pi is partitioning index, arr[p]
	        // is now at right place 
	        int pi = partition(arr, low, high);
	  
	        // Separately sort elements before
	        // partition and after partition
	        quickSortde(arr, high, pi - 1);
	        quickSortde(arr, pi + 1, low);
	    }
	}
	  
	// Function to print an array 
	public static void printArray(double[] arr, int size)
	{
	    for(int i = 0; i < size; i++)
	        System.out.print(arr[i] + " ");
	          
	    System.out.println();
	}
	
	public static void reverse(double[] arr, int n1)
    {
		double t;
        int i, k ;
        for (i = 0; i < n1 / 2; i++) {
            t = arr[i];
            arr[i] = arr[n1 - i - 1];
            arr[n1 - i - 1] = t;
        }
  
        // printing the reversed array
        System.out.println("Stocks in Desending order is");
        for (k = 0; k < n1; k++) {
            System.out.println(arr[k]);
        }
    }

}
