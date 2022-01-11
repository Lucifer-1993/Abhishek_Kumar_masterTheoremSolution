package App.master.theorm.main;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

import App.master.theorm.function.DesendingSorting;
import App.master.theorm.function.Seraching;
import App.master.theorm.function.Shorting;
import App.master.theorm.function.StocksRose;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);  
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the number of Company you want to store(note n should nobe be greater than 3): ");  
		//reading the number of elements from the that we want to enter  
		
		int n= sc.nextInt();
		
		//creates an array in the memory of length 10
		
		
		double [] array = new double [3];  
		String [] arrays = new String [3];
		for(int i=0; i<n; i++)  
		{  System.out.println("Enter company : "+(i+1)+ " Stock Value");  
		//reading array elements from the user   
		array[i]=sc.nextDouble();  
		 
		 System.out.println("Enter company : "+(i+1)+ " Stock Rose (only in true or false only letters are case sensitie so put adjact same)");  
		//reading array elements from the user
	 String temp= scn.next();
	 if(temp.equals("true") || temp.equals("false"))
		 arrays[i]=temp;  
	 else {System.out.println("Invalid input");
	 System.exit(1);}
		}
		
		
		
		
		System.out.println("Company Stocks are: ");  
		// accessing array elements using the for loop  
		for (int j=0; j<n; j++)   
		{  
			System.out.println("Company "+(j+1)+" Stocks are: ");
		System.out.println(array[j]);  
		  
		}
		 //User can Perform Activity
        System.out.println("Enter the operation that you want to perform");
        System.out.println("1 :Display the companies stock prices in ascending order");
        System.out.println("2 : Display the companies stock prices in descending order");
        System.out.println("3: Display the total no of companies for which stock prices rose today");
        System.out.println("4: Display the total no of companies for which stock prices declined today");
        System.out.println("5: Search a specific stock price");
        System.out.println("0 :Return");
        int p = sc.nextInt();
       
        
        if(p==1) {
        	Shorting obj =new Shorting();
        	
        	double arr[] = new double[array.length];
        	arr = array;
        	
        	int n1 = arr.length;
              
            Shorting.quickSort(arr, 0, n1 - 1);
            System.out.println("Assendindg Order Sorted Stocks: ");
            Shorting.printArray(arr, n1);
        	
        	
        }else if (p==2){
        	
        	DesendingSorting obj =new DesendingSorting();
        	
        	double arr[] = new double[array.length];
        	arr = array;
        	
        	int n1 = arr.length;
              
            DesendingSorting.quickSortde(arr, 0, n1 - 1);
            
            DesendingSorting.reverse(arr, n1);
        	
        }
        
        else if (p==3){
        	StocksRose ret = new StocksRose();
        	String arr[] = new String[arrays.length];
        	
        		arr=arrays;
        		System.out.print("The number of company for wich stock rose is ");
        		 String q   = "true";
                ret.answerQueries(arrays, q);
           
    	
    }
        	
       
        
        
        else if (p==4){ 	StocksRose ret = new StocksRose();
    	String arr[] = new String[arrays.length];
    	
		arr=arrays;
		System.out.print("The number of company for wich stock rose is ");
		 String q   = "false";
        ret.answerQueries(arrays, q);
   
}
        
        else if (p==5){
        	
        	System.out.println("Kindly provide the stck you want to serach");
        	double q = sc.nextDouble();
	       
        	 
        	 // Get the array
        	double arr12[] = new double[array.length];
        	arr12 = array;
        	
        	Seraching ob = new Seraching();
        	double arr[] = arr12;
            
            double x = q;
           
            int result = ob.binarySearch(arr, 0, n - 1, x);
            if (result == -1)
                System.out.println("Element not present");
            else
            	
                System.out.println("Stock found at place "
                                  + (result+1));
     
    
        }
        
        
        else if (p == 0){
        	System.exit(1);
        }else {System.out.println("Invalid Input");}
        
		 
	}

	private static void answerQueries(String[] arr, String[] q) {
		// TODO Auto-generated method stub
		
	}
	}

