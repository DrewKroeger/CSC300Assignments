package Assignment7;
//CSC300-DATA STRUCTURES- Assignment 7- Drew Kroeger
//This drives GenericStack2.java(or genericStack)
//Generic Stack 2 acts as a stack, but is actually a linked list, where the top of a stack is the front of a linked list
//IF YOU WANT TO SEE GENERIC STACK 1- WHICH IS JUST ARRAYS- no LL I STILL HAVE IT, let me know

public class StackDriver 
{
    public static void main(String[] args)
    {
        GenericStack2 <Integer> stack = new GenericStack2<>(); //make a new stack of integer type
        stack.display();//stack holds nothing so will print empty
        stack.push(45);//pushing into stack/LL
        stack.push(75);
        stack.push(92);
        stack.push(400);
        System.out.println("STACK SIZE FOR INT STACK: " +stack.size());//prints size
        stack.display();//displays contents of LL/stack
        System.out.println();
        GenericStack2 <Integer> stackCopy = stack.clone();//make a clone of the linked list
        stack.pop();//popping elements- does not display them
        stack.pop();
        System.out.println("\nHERE IS ORIGINAL COPY:");
        stack.display();
        System.out.println("\nHERE IS CLONED COPY");
        stackCopy.display();

        GenericStack2<String> stack2 = new GenericStack2<>();//make String type stack, same stuff as above
        stack2.push("Yep- E1");
        stack2.push("YEAH- E2");
        stack2.push("I am making a driver -E3");
        stack2.push("Hello Professor it is raining outside- E4");
        System.out.println("\nSTACK SIZE for STRING STACK: " +stack2.size());
        stack2.display();
        System.out.println();
        GenericStack2<String> stack2Copy = stack2.clone();
        stack2.pop();
        stack2.pop();
        stack2.pop();
        System.out.println("\nHERE IS ORIGINAL COPY");
        stack2.display();
        System.out.println("\nHERE IS CLONED COPY:");
        stack2Copy.display();
    }//end of main method
}//end of StackDriver.java
