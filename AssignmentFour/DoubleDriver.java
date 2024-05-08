package doubleArray;
import java.util.*;

public class DoubleDriver 
{
    public static void main(String[] args) 
    {
        // printing array info
        DoubleArray myarr = new DoubleArray();
        System.out.println("The size of the array is " + myarr.size());
        System.out.println("The largest index is: " + myarr.largest());
        System.out.println("The smallest index is: " + myarr.smallest());
        System.out.println();
        // filling the array
        myarr.put(5.5, 0);
        myarr.put(1.5, 1);
        myarr.put(22.0, 2);
        myarr.put(1.5, 3);
        myarr.put(5.32, 4);
        myarr.put(4.22, 5);
        myarr.put(5.9, 6);
        myarr.put(0.5, 7);
        myarr.put(55.5, 8);
        myarr.put(9.5, 9);
       
        // printing the array again
        System.out.println("The elements in the array are:");
        for( int i =0; i < myarr.size(); i++ )
        System.out.print(myarr.get(i) + " ");
        
        System.out.println("\n");
        System.out.println("The largest index in the array is: " + myarr.largest());
        System.out.println("The smallest index in the array is: " + myarr.smallest());
        System.out.println();
       
        // filling the array backward
       
        myarr.put(2.0, -1);
        myarr.put(3.0, -2);
        System.out.println();
       
        System.out.println("Again, the elements in the array are:");
        for( int i =0; i < myarr.size(); i++ )
        System.out.print(myarr.get(i) + " ");
        
        System.out.println("\n");
       System.out.println("The largest index in the array is: " + myarr.largest());
       System.out.println("The smallest index in the array is: " + myarr.smallest()
       +"\n");
       //generate errors
       System.out.println("Let's generate some errors\n");
       myarr.put(100.0, 25);
       myarr.put(100.0, -30);
       // another test….
       System.out.println();
       System.out.println("One more test...");
       System.out.println();
       DoubleArray hisarr = new DoubleArray(5);
       System.out.println("The size of the array is " + hisarr.size());
       System.out.println("The largest index is: " + hisarr.largest());
       System.out.println("The smallest index is: " + hisarr.smallest());
       // filling the array
       System.out.println();
       hisarr.put(5.5, 0);
       hisarr.put(1.5, 1);
        hisarr.put(22.0, 2);
       hisarr.put(1.5, 3);
       hisarr.put(5.32, 4);
       //printing the array
       System.out.println("The elements in the array are:");
       for( int i =0; i < hisarr.size(); i++ )
       System.out.print(hisarr.get(i) + " ");
       System.out.println("\n");
       System.out.println("The largest index in the array is: " + hisarr.largest());
       System.out.println("The smallest index in the array is: " + hisarr.smallest() +
       "\n'");
       // filling the array
       hisarr.put(2.0, -4);
       hisarr.put(3.0, -3);
       System.out.println();
       System.out.println("Again, the elements in the array are:");
       for( int i =0; i < hisarr.size(); i++ )
        System.out.print(hisarr.get(i) + " ");
       
        System.out.println("\n");
        System.out.println("The largest index in the array is: " + hisarr.largest());
        System.out.println("The smallest index in the array is: " + hisarr.smallest() +"\n");
        // generate some errors
        System.out.println("Let's generate some errors\n");
        hisarr.put(100.0, 25);
        hisarr.put(100.0, -30);
       
        }
        
}
