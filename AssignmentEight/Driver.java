/********
 * CSC300
 * DREW KROEGER
 * ASSIGNMENT 7- this is a singly linked list, what we added was a split function that splits the main link list into two link lists based on whether or
 * not a value was greater or lesser than the splitting value
 * THE ORIGINAL LIST IS PRESERVED
 * NOTE- in the driver given find(4.99) is a double- in the link list provided on moodle it was a int(LINKLIST LINE 20), and idata on 23, changed to dData
 * Delete function would also need to be changed to work properly with doubles and not ints- also see line 13 in linked list comment
 **************/

package Assignment8;

public class Driver 
{
    public static void main(String[] args)
{
 LinkList theList = new LinkList(); // make list
 Link firstHead = null;
 Link secondHead = null;

 theList.insertFirst(22, 2.99); // insert 4 items
 theList.insertFirst(44, 4.99);
 theList.insertFirst(66, 6.99);
 theList.insertFirst(88, 8.99);
 theList.displayList(); // display list
 Link f = theList.find(4.99); // find item

if( f != null)
{

Link arr[] = new Link[2];
arr =theList.split(44);
firstHead = arr[0];
secondHead = arr[1];
 while(firstHead != null) // until end of list,
 {
 firstHead.displayLink(); // print data
 firstHead = firstHead.next; // move to next link
 }

 System.out.println();
 while(secondHead != null) // until end of list,
 {
 secondHead.displayLink(); // print data
 secondHead = secondHead.next; // move to next link
 }

}
else
{
 System.out.println("Try a different search key! The one input for 'f' is not found in 'theList'. Thank You!");
 } 

}// end main
} // end class

