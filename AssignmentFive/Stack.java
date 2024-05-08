/************
 * CSC300
 * Drew Kroeger
 * Assignment 5- This class modifies the stackX class in the moodle examples, which I assume comes from the Ebk Data Structures and Algorithms in Java
 ************/


public class Stack
{
    private static int maxSize;        // size of stack array
    private static long[] stackArray;
    private static int top;            // top of stack
    //--------------------------------------------------------------
    public Stack(int s)         // constructor
        {
        maxSize = s;             // set array size
        stackArray = new long[maxSize];  // create array
        top = -1;                // no items yet
        }
    //--------------------------------------------------------------
    public void push(long j)    // put item on top of stack
        {
        stackArray[++top] = j;     // increment top, insert item
        }
    //--------------------------------------------------------------
    public long pop()           // take item from top of stack
        {
        return stackArray[top--];  // access item, decrement top
        }
    //--------------------------------------------------------------
    public long peek()          // peek at top of stack
        {
        return stackArray[top];
        }
    //--------------------------------------------------------------
    public boolean isEmpty()    // true if stack is empty
        {
        return (top == -1);
        }
    //--------------------------------------------------------------
    public boolean isFull()     // true if stack is full
        {
        return (top == maxSize-1);
        }
    //--------------------------------------------------------------
     
    //this method displays the stack from top to bottom(top element to zero)

    public static void topToBottom() 
    {
        for (int i = maxSize-1; i>=1;i--) //we use a for loop that goes from top to bottom
        {
           System.out.println(stackArray[i-1]); //print element
        }
    }//end top to bottom method

    //*****************************************************************

    //this method displays the stack from bottom element to top

    public static void bottomToTop() //the class method means this must be static, but i cannot use top or max size or array length without making them static- or maybe i am missing something obvious
    {
        for (int i = 1;i<=maxSize-1; i++) //we start at index 1 because 0 is just a 0,but we also must do maxSize minue to get the last element, you could also do top+1 but n is not supposed to be greater than top based on my itemAt method if statement
        {
            System.out.println(stackArray[i]);
        }

    }//end bottom to top method

    //*************************************************************

    //this method flips the elements in the array

    public void flip()
    {
        for (int i = 0; i<maxSize/2; i++)
        {
            long temp = stackArray[i];
            stackArray[i] = stackArray[maxSize-i-1];
            stackArray[maxSize-i-1] = temp;
        }
    }//end flip method

    //*************************************************************

    //this method returns the value at the specified element index n

    public long itemAt(int n)
    {
        if(n>top) //out of bounds checker
        {
            System.out.println("Error: " + n + " out of range.");
            return 0;
        }

        long itemAtN = (stackArray[top]-stackArray[n]); //simple item at n is just the top index minus n, since we are returning n elements from the top
        return itemAtN;
    }//end of method item at
}//end of Stack Class