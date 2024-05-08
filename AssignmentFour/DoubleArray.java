package doubleArray;

/***************
*   CSC300 
*   Drew Kroeger
*   Assignment 4- this class puts elements(doubles) into an array- it can take postive and negative indexes, it also can return smallest and largest indices of the array.
****************/
public class DoubleArray 
{
    int putLength; //this is used to determine how many times put has been called for that array
    public double[] arr; //declaration
    int smallestIndex;  //used for smallestIndex
    int largestIndex;   //used to find largest index of that array


    public DoubleArray(int size) //this is the constructor for if an array has been explicitly declared with a size
    {
        arr = new double[size];
        largestIndex = Integer.MAX_VALUE;
        smallestIndex = Integer.MIN_VALUE;
        putLength= 0;
    }

    public DoubleArray() //this is if the array has not been declared we do ten based on sample run
    {
        arr = new double[10];
        largestIndex = Integer.MAX_VALUE;
        smallestIndex = Integer.MIN_VALUE;
        putLength=0;
    }

    //*************************************************** */

    //this method is the method that puts the sepcified mumber  into the specified index, it also doubles the array when necessary, and values the biggest and smallest indicies 
    public void put(double number,int index)
    {
        int indexCopy=index; //index copy is used if the number is negative for smallest index comparison

        if (Math.abs(index)> arr.length) //if the index is bigger than the array length than we give a out of bounds error
            {
                System.out.println("Error: " + index + " as an index is out of bounds");
                return;
            }
            putLength++; //everytime put(this method) runs we up the put length


        if (this.putLength > this.arr.length)//if put is run more for this array than the array has in length than we know it is time to up the array length(unless the elements have been overwritten a bunch then a different if should be made)
            {
                System.out.println("The array is Full now");
                int newMax = (arr.length * 2); 
                double arrCopy[] = new double[newMax];
                System.arraycopy(arr, 0, arrCopy, 0, arr.length);
                arr = arrCopy;
                System.out.println("The capacity has been doubled: " + newMax);
            }
        if (index < 0)//if the index is negative we make it positive
            {
                index = arr.length + index;
            }
            
            //i beleive you could also do it the other way, where you compare the largest index to min integer, and smallest index to max integer, instead of making smallest index 0(as below)
        if(putLength == 1)//this is so we know that the put method has been used and the array is actually filled with something, so we can make the largest index compare properly, and not compare to the largest index of them all
        {
            this.largestIndex = indexCopy;
        }
        if(this.largestIndex < indexCopy)
            {
                this.largestIndex= indexCopy;
            }

        smallestIndex = 0;    
        if (this.smallestIndex > indexCopy) 
            {
                this.smallestIndex =  indexCopy;
            }
        else  //this is so if no negative indicies were put in, we return the min value
            {
                this.smallestIndex = Integer.MIN_VALUE;
            }

        arr[index]= number; //what the whole function is about, putting the right number into the right index
    }//end of put method




    //************************************************** */

    //this method returns the value at the index put in the argument

    public double get(int index)
    {
        
        if (arr[index] == 0.0)//if the value at that index is 0.0(default) then we return NaN to show it is not actually a value              
        {
            return Double.NaN;
        }
        else //if the vlaue is not 0.0 at the specified indec than we return the actual value
        {
            return arr[index];
        }
    }//end of get method




    //****************************************************** */

    // this method return the size of the array
    public int size()
    {
        return arr.length;
    }//end of size

    //******************************************************** */
    //these two methods reutnr the smallest and largest indicies of the array, most of the comparisons are done in the put method
    public int largest()
    {
       return largestIndex;
    }//end of largest
    public int smallest()
    {
        return smallestIndex;
    }//end of smallest


}//end of DoubleArray Class
