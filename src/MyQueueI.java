/**
 * @author Marissa Gonçalves
 * Due Date: October 24, 2018
 * Specifies operations for a simple unbounded first-in-first-out (FIFO) queue.
 * @param <E> The parameter of the Node class which can define any type of value.
 */

public interface MyQueueI<E>
{
     
    /**
     * Removes and returns the element at the front of this queue.
     * @return The element at the front of the queue.
     */
    public E dequeue();
      
    
    
    /**
     * Adds the specified element to the back of this queue.
     * @param element The specific element of be added to the queue.
     */
    public void enqueue(E element);
    
        
    
    /**
     * Returns true if this queue contains no elements.
     * @return The boolean value when the queue doesn't include a single method.
     */
    public boolean isEmpty();
    
    
    
    /**
     * Returns, but does not remove, the element at the front of this queue.
     * @return The element located at the front of the queue.
     */
    public E peek();
    
    
    
    
}
