/**************************************
 * CSC300
 * Drew Kroeger
 * This is the main for the Deque class. This takes a string and splits it up, then compares the indices aproriately far from the middle together.
 * It splits spaces commas periods questions marks and exclamation marks. If a word has an apostrophe, then it is all good. 
 * It disregards capital vs lower case letters. Deque has a big method called palindrome that i added
 * I also changed the array types in the deque to string, since we are working with strings not numbers
 **************************************/
package Assignment6;//this is auto made becuase i am in a subfolder, i dont think it is actually needed.
import java.util.Scanner;



public class PalindromeMain 
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        String palindrome;                                                  //need this here for the do while
        do
        {

        System.out.println("Enter a word palindrome, or q to quit.");     //keep going until the user quits
        palindrome = stdIn.nextLine();                                      //takes in string

            if(palindrome.equalsIgnoreCase("Q"))              //if palindrome is q than we can exit-forget the rest of the code
            {
                System.out.println("Thank you for exiting!");
                break;
            }




        String [] strArr = palindrome.split("[, ?.!]+");            //this is what splits the string into elements of an array, any of the regex will split the array
        Deque deque = new Deque(strArr.length);                        //need a deque object so we can access the methods of the deque class
            
            for (int i = strArr.length/2-1; i>=0;i--)                     //copy the contents of the strArr into the deque object(an array)-
            {  
                    deque.insertLeft(strArr[i]); 
            }
            
            for (int i = strArr.length/2; i < strArr.length; i++) 
            {
                deque.insertRight(strArr[i]);
            } 
            
            deque.palindrome();                                     //this method takes the sorted arrays and compares each word element

            
        }while(!(palindrome.equalsIgnoreCase("q")));  //if the palindrome doesnt equal q for quit we prompt again
    }//end of main method
}//end of Palindrome main class
