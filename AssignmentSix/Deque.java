///CSC300 DREW KROEGER ASSIGNMENT 6- THIS GOES WITH PALINDROMEMAIN.JAVA


package Assignment6;

public class Deque 
{
 private int maxSize;
 private String[] dekArray;
 private int left;
 private int right;
 private int nItems;
//--------------------------------------------------------------
public Deque(int s) // constructor
 {
 maxSize = s;
 dekArray = new String[maxSize];
 int center = maxSize/2 - 1;
 left = center+1; // left and right
 right = center; // start out "crossed"
 nItems = 0;
 }
//--------------------------------------------------------------
 public void insertLeft(String j) // put item at left of deque
 {   
 if(left == 0) // deal with wraparound
 left = maxSize;
 dekArray[--left] = j; // insert and decrement left
 nItems++; // one more item
 }
//--------------------------------------------------------------
 public void insertRight(String j) // put item at right of deque
 {
 if(right == maxSize-1) // deal with wraparound
 right = -1;
 dekArray[++right] = j; // insert and increment right
 nItems++; // one more item
 }
//--------------------------------------------------------------
 public String removeLeft() // take item from left of deque
 {
 String temp = dekArray[left++]; // get value and incr left
 if(left == maxSize) // deal with wraparound
 left = 0;
 nItems--; // one less item
 return temp;
 }
//--------------------------------------------------------------
 public String removeRight() // take item from right of deque
 {
 String temp = dekArray[right--]; // get value and decr right
 if(right == -1) // deal with wraparound
 right = maxSize-1;
 nItems--; // one less item
 return temp;
 }
//--------------------------------------------------------------
 public boolean isEmpty() // true if deque is empty
 { return (nItems==0); }
//--------------------------------------------------------------
 public boolean isFull() // true if deque is full
 { return (nItems == maxSize); }
//--------------------------------------------------------------
 public int size() // number of items in deque
 { return nItems; }
//--------------------------------------------------------------
 public void display()
 {
 System.out.print("Array: ");
 for(int j=0; j<maxSize; j++) // print array contents
 System.out.print( dekArray[j] + " " );
 System.out.println("");
 System.out.print("Deque: ");
 if(left <= right) // print deque contents
 for(int j=left; j<=right; j++)
 System.out.print( dekArray[j] + " ");
 else if( isEmpty() == false )
 {
 for(int j=left; j<maxSize; j++)
 System.out.print( dekArray[j] + " ");
 for(int j=0; j<=right; j++)
 System.out.print( dekArray[j] + " ");
 }
 System.out.println("");
 } // end display()


//********************************************** */
//this is a getter and setter i made, i dont think they are actually needed, but they could possibly be used
 public String getValue(int i)
 {
    return dekArray[i];
}
public void setValue(int i, String s)
{
    dekArray[i] = s;
}
//************************************************* */

/*This is the second main part of the assingnment. This takes the deque object in the main and then compares  the words the same distance from the middle
*If the words are the same then the counter goes up, if the words are not then the counter does not go up and will not be successful in the if
* If the counter is the length/2 then we know every word is the same- it works for odd amount of words i believe due to a .5 being cut off in the length/2
*-
*/
public void palindrome()
{
    int counter = 0;
            for (int i = 0; i<dekArray.length/2;i++)
            {
                if (dekArray[i].equalsIgnoreCase(dekArray[dekArray.length-i-1]))
                {
                    counter++;
                } 
            }
            if (counter == dekArray.length/2)
            {
                System.out.println("This is a word palindrome");
            }
            if (counter < dekArray.length/2)
            {
                System.out.println("This is not a word palindrome");
            }
    }//end of palindrome method
}//end of deque class