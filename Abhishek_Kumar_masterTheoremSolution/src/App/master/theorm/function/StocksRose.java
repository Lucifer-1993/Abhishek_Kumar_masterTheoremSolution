package App.master.theorm.function;




//Java program to count frequencies of array items


public class StocksRose {
	/* Returns count of occurrences of s in arr[] */
	/* Returns count of occurrences of s in arr[] */
    static int search(String[]arr, String s)
    {
            int counter = 0;
            for (int j = 0; j < arr.length; j++)
 
                /* checking if string given in query is
                  present in the given string. If present,
                  increase times*/
                if (s.equals(arr[j]))
                    counter++;
 
           return counter;
    }
 
   public static void answerQueries(String[] arr, String q)
    {
       
            System.out.print(search(arr, q) + " ");
    }}