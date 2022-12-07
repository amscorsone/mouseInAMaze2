
import java.util.LinkedList;
import  java.util.ArrayList; 

/**
 * stores the cars that are waiting in line
 *
 * @author Amalia
 * @version April 27th
 */
public class LLQueue<T> implements KQueue<T>
{
    // instance variables - replace the example below with your own
    private LinkedList<T> list; 

    /**
     * Constructor for objects of class LLQeue
     */
    public LLQueue()
    {

        this.list = new LinkedList<T>();
        list.toString();
    }

    
    /**
     * returns string of inputs
     */
    public String toString()
    {
        return list.toString();
    }

    /** Adds a element to the queue follwoing the previous elements 
     *    @param item - the object to add to the queue
     **/
    public void enqueue(T item)
    {
        list.add(item);
    }

    /** removes inputted element.
     *    @param item - the object to add to the queue
     **/
    public void dequeue(T item)
    {
        list.remove(item);
    }

    /** Returnstrue if this queue is empty
     *  false otherwise.
     **/
    public  boolean isEmpty()
    {
        return list.isEmpty();
    }

    /** Returns the size of the list
     **/
    public int size()
    {
        return list.size();
    }

    /** Returns the element at the "front" of this queue, without
     *  modifying the queue.
     *    @returns the element at the front of the queue
     *
     **/
    public T peekFront()
    {
        
        return list.peekFirst();

    }
}
