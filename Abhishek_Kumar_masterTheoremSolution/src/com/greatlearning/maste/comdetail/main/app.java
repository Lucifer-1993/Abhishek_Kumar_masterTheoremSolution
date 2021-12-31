package com.greatlearning.maste.comdetail.main;
import java.util.Scanner; 
import java.util.Arrays;
import java.util.stream.IntStream;
import com.greatlearning.asendingdecending.*;



	public class app {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s;
			int n; 
			int k=0;
			int z=0;
			int p;
			double q;
			Scanner sc=new Scanner(System.in);  
			System.out.print("Enter the number of Company you want to store: ");  
			//reading the number of elements from the that we want to enter  
			n=sc.nextInt();
			
			//creates an array in the memory of length 10  
			double [] array = new double [n];  
			System.out.println("Enter company : "+(k+1)+ "Stock Value");  
			for(int i=0; i<n; i++)  
			{  
			//reading array elements from the user   
			array[i]=sc.nextDouble();  
			}  
			
			
			System.out.println("Company Stocks are: ");  
			// accessing array elements using the for loop  
			for (int i=0; i<n; i++)   
			{  
			System.out.println(array[i]);  
			}
			
			
	        System.out.println("Whether company's stock price rose today compare to yesterday? If yes Type true else False");
	       
	        String[] larray=new String[n];
	        
	       

	        for(int i=0;i<n;i++){
	            System.out.println("Whether company "+(i+1)+" Stock Rose Only True or false :");
	            larray[i]=sc.next();
	        }
	        System.out.println("Is company"+(z+1)+" Stock value Entered by user rose today:");
	        
	        

	        for(String s11:larray){
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
	        p=sc.nextInt();
	        
	        if(p==1) {
	        	Shorting obj =new Shorting();
	        	
	        	double arr[] = new double[array.length];
	        	arr = array;
	        	
	        	int n1 = arr.length;
	              
	            obj.quickSort(arr, 0, n1 - 1);
	            System.out.println("Assendind Order Sorted Stocks: ");
	            obj.printArray(arr, n1);
	        	
	        	
	        }else if (p==2){
	        	
	        	DesendingSorting obj =new DesendingSorting();
	        	
	        	double arr[] = new double[array.length];
	        	arr = array;
	        	
	        	int n1 = arr.length;
	              
	            obj.quickSortde(arr, 0, n1 - 1);
	            
	            obj.reverse(arr, n1);
	        	
	        }
	        
	        else if (p==3){
	        	StocksRose fg = new StocksRose();
	        	String[] arr56 = new String[array.length];
	        	arr56 = larray;
	        int d = arr56.length;
	        fg.countFreq(arr56, n);
	    }
	        	
	       
	        
	        
	        else if (p==4){StocksRose fg = new StocksRose();
        	String[] arr56 = new String[array.length];
        	arr56 = larray;
        int d = arr56.length;
        fg.countFreq(arr56, n);}
	        
	        else if (p==5){
	        	
	        	System.out.println("Kindly provide the stck you want to serach");
	        	 q=sc.nextInt();
	        	 // Get the array
	        	double arr12[] = new double[array.length];
	        	arr12 = array;
	     
	            // Get the value to be checked
	            double toCheckValue = q;
	     
	            // Print the array
	            System.out.println("Array: "
	                               + Arrays.toString(arr12));
	     
	            // Check if this value is
	            // present in the array or not
	            check(arr12, toCheckValue);
	        }
	        
	        
	        else if (p == 0){
	        	System.exit(0);
	        }
	        
		}

		private static void check(double[] arr12, double toCheckValue) {
			
			
		}

	}
		    
		  

	


