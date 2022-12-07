 import java.util.LinkedList;

public interface KQueue<T>
{
    /** Returns <code>true</code> if this queue is empty;
     *  <code>false</code> otherwise.
     **/
    boolean isEmpty();

    /** Adds a specified object to the "back" of this queue.
     *    @param item - the object to add to the queue
     **/
    void enqueue(T item);

    /** Removes the element at the "front" of this queue.
     *    @returns the removed element
     *    @throws NoSuchElementException if the queue is empty
     **/
    T dequeue();

    /** Returns the element at the "front" of this queue, without
     *  modifying the queue.
     *    @returns the element at the front of the queue
     *    @throws NoSuchElementException if the queue is empty
     **/
    T peekFront();
    
    /** Returns the size of the queue.
     *    @returns the size of the queue
     **/
    int size();
    
    /** Removes all the elements in the queue and returns the empty list.
     *    @returns the empty ist
     **/
    LinkedList<T> reset();
 
}