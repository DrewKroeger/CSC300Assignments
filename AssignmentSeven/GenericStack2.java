package Assignment7;
//*****************************************************************

 //This is the GenericStack 2 class, it acts as a stack Data Structure,but is a single linked list
 class Node<T>//we need this so we can make nodes, or node objects
{
    T item;//item is a generic type, so it can be used by any wrapper class
    Node <T> next;//this is so we can point to the next item in the LL

    //*************************************************************
    Node(T item)//this makes the generic item held in the node
    {
        this.item = item;
    }
}//end of generic node class

public class GenericStack2 <T> //Generic Stack 2 is a generic class
{
    private Node<T> top;//makes a top pointer of generic
    private int size;//this is used to return the size, could replace top == null with this( i think)
    
    //************************************************* */
    //the generic stack 2 constructor

    public GenericStack2()
    {
        top = null;//initialize top to be null since there is nothing in the stack yet
    }

    //*********************************************************** */

    //the push method takes an element and inserts it in the first slot of the linked list

    public void push(T j)//add
    {
        Node<T> newNode = new Node(j);//make a new node object holding j as an item
        newNode.next = top;//make the next item become top
        top = newNode;//top is now the new node- where top is the first element in the LL(LIKE A STACK HAS TOP- top does not point to NULL in this case)
        size++;//increment size for return size
    }

    //***************************************************** */

    //this removes the first element in the LL

    public T pop()
    {
        T item = top.item; //make item become the first item in the nodes
        top = top.next;//make top point to the next item in the linked list,GC picks this node up
        size--;//decrement size for size method
        return item;//return item that was popped
    }

    //*************************************************** */

    //this looks at the first/top element and does not remove it

    public T peek()
    {
        if(top != null)//if stack has atleast one element we return the first element
        {
        return top.item;
        }
        else
        {
            System.out.println("Stack is empty!");//not one element means empty stack
            return null;//I believe this works, but it was having trouble making an item T to return
        }
    }

    //**************************************************** */

    //this checks if the LL/stack has no elements

    public boolean isEmpty()
    {
        if (top == null)//no elements means is is empty which returns true
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //*********************************************************** */

    //using the size int in push and pop we return it here, gives how many nodes we have

    public int size()
    {
        return size;
    }
    //****************************************************************** */

    //this is the clone method, not using object clone, but our own, it takes the nodes we have and makes a copy of them in the same order
    public GenericStack2<T> clone() 
    {
        GenericStack2<T> clone = new GenericStack2<>();//make a new generic stack clone
        Node<T> current = top;//current is top, and top is the first element in the LL
        Node<T> topTwo = null;//the top copy is null for now
        Node<T> previous = null;//previous is also null
        while (current != null)//while the current element is not the end we go in here
        {
            Node <T> node = new Node<>(current.item);//we make a new node that stores/copies the node we are currently on
            if (topTwo == null)//this iterates only once, the first time, it makes the cloned top become the very first node we make
            {
                topTwo = node;
            }
            else//every other time than the first we go here
            {
                previous.next = node;//makes the previous node link with the node we are currently on
            }
            previous = node;//this makes previous the node we are currently on
            current = current.next;//this makes the next node the current one
        }//end of while loop
        clone.top = topTwo;//make the clones top the top two, this could also be just top(I think but did not test)
        clone.size = size;//this makes clone size same as regular size,since we are not pushing and popping here size would be off if we didnt do this
        return clone;//returns clone
    }//end of clone method

    //************************************************** */

    //this method displays the stack/LL

    public void display()
    {
        Node<T> temp = top;//becomes first in the LL
        if (isEmpty() == true)//if stack is empty
        {
            System.out.println("The stack is empty\n");
        }
        while (temp != null)//not empty will display each item in the nodes
        {
            System.out.print(temp.item + "\t");
            temp = temp.next;//basically a ++
        }//end of while
    }//end of display method
}//end of Generic Stack 2 class
