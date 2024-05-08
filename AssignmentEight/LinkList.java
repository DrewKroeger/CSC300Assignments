package Assignment8;

public class LinkList
   {
   private Link first;            // ref to first link on list

// -------------------------------------------------------------
   public LinkList()              // constructor
      {
      first = null;               // no links on list yet
      }
// -------------------------------------------------------------
   public void insertFirst(int id, double dd)//TODO: THIS WAS ORIGINALLY INT DD? BUT PROFESSOR HAD IT AS DOUBLES IN MAIN DRIVER
      {                           // make new link
      Link newLink = new Link(id, dd);
      newLink.next = first;       // it points to old first link
      first = newLink;            // now first points to this
      }
// -------------------------------------------------------------
   public Link find(double key)      // find link with given key
      {                           // (assumes non-empty list)
      Link current = first;              // start at 'first'
      while(current.dData != key)        // while no match,
         {
         if(current.next == null)        // if end of list,
            return null;                 // didn't find it
         else                            // not end of list,
            current = current.next;      // go to next link
         }
      return current;                    // found it
      }
// -------------------------------------------------------------
   public Link delete(int key)    // delete link with given key
      {                           // (assumes non-empty list)
      Link current = first;              // search for link
      Link previous = first;
      while(current.iData != key)
         {
         if(current.next == null)
            return null;                 // didn't find it
         else
            {
            previous = current;          // go to next link
            current = current.next;
            }
         }                               // found it
      if(current == first)               // if first link,
         first = first.next;             //    change first
      else                               // otherwise,
         previous.next = current.next;   //    bypass it
      return current;
      }
// -------------------------------------------------------------
   public void displayList()      // display the list
      {
      System.out.print("List (first-->last): ");
      Link current = first;       // start at beginning of list
      while(current != null)      // until end of list,
         {
         current.displayLink();   // print data
         current = current.next;  // move to next link
         }
      System.out.println("");
      }
//-------------------------------------------------------------

//this method is used in a linked list, it takes that linked list and splits it based on the splitting value(the int parameter)

      public Link[] split(int splitValue)
      {
        Link arr[]= new Link[2];                        //we do this as in the main there is an array pointing to to links
        LinkList listOne = new LinkList();              //we make 2 linklist to split the values and store them
        LinkList listTwo = new LinkList();
        Link current = first;                           //have to start at beginning of link list in the main

        while (current != null)                         //while the main link list does not point to null/end we keep going
        {
            if (splitValue < current.iData)             //split value is less than i data we store the value in the first link list
            {
                listOne.insertFirst(current.iData,current.dData);
            }
            if(splitValue >= current.iData)             //split value equal or higher than i data we store it in second list
            {
                listTwo.insertFirst(current.iData,current.dData);
            }
            
            current = current.next;//go to next node
        }//end of while loop


        arr[0] = listOne.first;                         //at the end, when all main link list points are put in either list one or two, we make the arr of links point to 
        arr[1] = listTwo.first;                         //cont-either the first link list or second link list
        return arr;

      }//end split method
// -------------------------------------------------------------
   }  // end class LinkList
