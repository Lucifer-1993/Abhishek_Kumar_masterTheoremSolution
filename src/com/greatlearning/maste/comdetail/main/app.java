package com.greatlearning.maste.comdetail.main;
import java.util.Scanner; 
import java.util.Arrays;
import java.util.stream.IntStream;
import com.greatlearning.asendingdecending.*;



	public class app {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc=new Scanner(System.in);  
			System.out.print("Enter the number of Company you want to store: ");  
			//reading the number of elements from the that we want to enter  
			
			DefiningVeriables rn =new DefiningVeriables();
			int n = rn.getN();
			n =sc.nextInt();
			
			//creates an array in the memory of length 10
			int k = rn.setK(0);
			
			double [] array = new double [n];  
			
			for(int i=0; i<n; i++)  
			{  System.out.println("Enter company : "+(i+1)+ " Stock Value");  
			//reading array elements from the user   
			array[i]=sc.nextDouble();  
			}  
			
			
			System.out.println("Company Stocks are: ");  
			// accessing array elements using the for loop  
			for (int i=0; i<n; i++)   
			{  
				System.out.println("Company "+(i+1)+" Stocks are: ");
			System.out.println(array[i]);  
			}
			
			
	        System.out.println("Whether company's stock price rose today compare to yesterday? If yes Type true else False");
	       
	             String[] larray=new String[n];
	        
	       

	        for(int i=0;i<n;i++){
	            System.out.println("Whether company "+(i+1)+" Stock Rose Only True or false :");
	            larray[i]=sc.next();
	            
	          
	        }
	       int i=0;
	        System.out.println("Is company"+(i+1)+" Stock value Entered by user rose today:");
	        
	        

	        for(String s11:larray){
	        	System.out.println("Is company"+(i+1)+" Stock  rose today:");
	            System.out.println(s11);
	        }
	        
	        //User can Perform Activity
	        System.out.println("Enter the operation that you want to perform");
	        System.out.println("1 :Display the companies stock prices in ascending order");
	        System.out.println("2 : Display the companies stock prices in descending order");
	        System.out.println("3: Display the total no of companies for which stock prices rose today");
	        System.out.println("4: Display the total no of companies for which stock prices declined today");
	        System.out.println("5: Search a specific stock price");
	        System.out.println("0 :Return");
	        int p = rn.getP();
	        p=sc.nextInt();
	        
	        if(p==1) {
	        	Shorting obj =new Shorting();
	        	
	        	double arr[] = new double[array.length];
	        	arr = array;
	        	
	        	int n1 = arr.length;
	              
	            Shorting.quickSort(arr, 0, n1 - 1);
	            System.out.println("Assendind Order Sorted Stocks: ");
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
	        	StocksRose fg = new StocksRose();
	        	String[] arr56 = new String[array.length];
	        	arr56 = larray;
	        int d = arr56.length;
	        StocksRose.countFreq(arr56, d);
	    }
	        	
	       
	        
	        
	        else if (p==4){StocksRose fg = new StocksRose();
        	String[] arr56 = new String[array.length];
        	arr56 = larray;
        int d = arr56.length;
        StocksRose.countFreq(arr56, n);}
	        
	        else if (p==5){
	        	
	        	System.out.println("Kindly provide the stck you want to serach");
	        	double q = rn.getQ();
		       
	        	 q=sc.nextInt();
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
	                System.out.println("Element found at index "
	                                   + result);
	     
	    
	        }
	        
	        
	        else if (p == 0){
	        	System.exit(0);
	        }else {System.out.println("Invalid Input");}
	        
		}

		

	}
		    
		  

	


