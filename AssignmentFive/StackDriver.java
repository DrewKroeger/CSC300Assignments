/*******************
 * CSC300
 * Drew Kroeger
 * assignment 5 driver- see stack.java/stack class for information
 *******************/


public class StackDriver //this is the driver
{
    public static void main(String[] args)
    {
        Stack stack = new Stack(5);
        System.out.println("Testing the flip method...");
        System.out.println("Lets push some items onto the stack");
        
        stack.push(20);
        System.out.println("pushing " + stack.peek()); //this is how to see what we just pushed into the stack
        stack.push(40);
        System.out.println("pushing " + stack.peek());
        stack.push(60);
        System.out.println("pushing " + stack.peek());
        stack.push(80);
        System.out.println("pushing " + stack.peek());

        System.out.println("Let's flip the stack now... \n");//flipping the stack
        stack.flip();
        System.out.println("and print the stack from bottom to top");
        Stack.bottomToTop();
        System.out.println("Let's flip it one more time... ");
        stack.flip();
        System.out.println("and print it from top to bottom");
        Stack.topToBottom();
        System.out.println("Now lets print the element at n equals 2: \n" + stack.itemAt(2));
        System.out.println("What about at n equals 100?");
        stack.itemAt(100);
        System.out.println("Done!");
    }//end of main method
}//end of stack driver class