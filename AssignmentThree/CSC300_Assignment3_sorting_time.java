package Other;
/************
 * CSC300
 * Drew Kroeger
 * Assignment 3- This code compares the run time of different sorting algorithms(using 5000 integers)
 * Lafore, Robert. Data structures and algorithms in Java. Sams publishing, 2017-- the sorting alogrithms used are a modified version coming
 * from this book(no swap method)
 *************/
public class CSC300_Assignment3_sorting_time
{
public static void main(String[]args)
    {
        int[] a= new int[5000];                     //creating a new array with 5000 ints
        int[] b= new int[5000]; 
        int[] c= new int[5000]; 
        for (int i=0;i<a.length;i++)                //for loop fills the array with 5000 random ints
        {
            int number = (int)(Math.random()*10000);
            a[i]= number;
            b[i]= number;
            c[i]= number;
        }

        long startOne = System.currentTimeMillis();    //records the time before the sort starts

        int i, j;

        for(i=a.length-1; i>1; i--)            //this is the bubble sort
        {   
           for(j=0; j<i; j++) 
           {       
              if( a[j] > a[j+1]) 
              {      
              int temp = a[j+1];
              a[j+1] = a[j];
              a[j] = temp;          
              }
            }
        }
        long endOne = System.currentTimeMillis();       //records the time after the sort
        System.out.println("Time for bubble sort in milliseconds:" + (endOne - startOne)); //does the difference in time before and after in milliseconds

        long startTwo= System.currentTimeMillis();   //records time before the sort happens

        int min;
        for(i=0; i<b.length-1; i++)       // outer loop
         {
            min = i;                          // minimum
            for(j=i+1; j<b.length; j++)    // inner loop
                if(b[j] < b[min] ) 
                {                               // if min greater,
                    min = j;   
                    int temp = b[i];
                    b[i] = b[min];
                    b[min] = temp;              // swap them
                }                               //end of if
            }                                   //end of selection sort for loop
        
        long endTwo = System.currentTimeMillis(); //records time after selction sort happens
        System.out.println("Time for selection sort in milliseconds:" + (endTwo-startTwo));


        

        long startThree = System.currentTimeMillis(); //checks time before third sort algorithm
        for(i=1; i<c.length; i++)     // out is dividing line
        {
        int temp = c[i];            // remove marked item
        j = i;                      // start shifts at out
        while(j>0 && c[j-1] >= temp) // until one is smaller,
           {
           c[j] = c[j-1];            // shift item to right
           --j;                       // go left one position
           }
        c[j] = temp;
        }
        long endThree = System.currentTimeMillis(); //checks time after third sorting algorithm(insertion)
        System.out.println("Time for insertion sort in milliseconds:" + (endThree-startThree));//finds the time of the insertion sort



    }//end of main


}