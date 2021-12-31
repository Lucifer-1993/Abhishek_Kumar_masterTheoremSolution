package com.greatlearning.asendingdecending;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Seraching {
	
	// Function return true if given element
    // found in array
    private static void check(int[] arr, int toCheckValue)
    {
        // check if the specified element
        // is present in the array or not
        // using Linear Search method
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
                
            }
        }
 
        // Print the result
        System.out.println("Is " + toCheckValue
                           + " present in the array: " + test);
    }
 
    
 
}
