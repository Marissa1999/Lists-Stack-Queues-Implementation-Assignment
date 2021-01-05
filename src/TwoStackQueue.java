import java.util.List;
import java.util.Stack;

/**
 * @author Marissa Gonçalves
 * Due Date: October 24, 2018
 * Implements a queue using on two stacks.
 * @param <E> The parameter of the Node class which can define any type of value.
 */


public class TwoStackQueue<E> implements MyQueueI<E>
{
    
    /**
     * The in-stack queue enqueues the elements.
     */
    private Stack<E> inQueue;
    
    
    /**
     * The out-stack queue dequeues the elements.
     */
    private Stack<E> outQueue;

    
    
    /**
     * Creates an empty queue by creating two new stack objects from variables.
     */
    public TwoStackQueue()
    {
        this.inQueue = new Stack<>();
        this.outQueue = new Stack<>();
    }
  
    
    
    
    /**
     * Creates a queue by constructing an empty out-stack and an in-stack containing all list elements.
     * @param L The list of elements to fill the in-stack.
     */
    public TwoStackQueue(List L)
    {
       this();
       
       for (Object element : L)
        {
            this.inQueue.push((E) element);
        }   
       
    }
    
    
    
    
     /**
     * Adds the specified element to the back of this queue.
     * @param element The specific element of be added to the queue.
     */
    @Override
    public void enqueue(E element) 
    {   
       this.inQueue.push(element);   
    }
    
    
    
    
    /**
     * Removes and returns the element at the front of this queue.
     * @return The element at the front of the queue.
     */
    @Override
    public E dequeue() 
    {
        
        if (this.outQueue.isEmpty() && !this.inQueue.isEmpty()) 
        {
            
          while (!this.inQueue.isEmpty()) 
          {
            this.outQueue.push(this.inQueue.pop());
          }
          
        }
     
        else if (this.outQueue.isEmpty() && this.inQueue.isEmpty())
        {
            return null;
        }
        
        return this.outQueue.pop();

    }
    
    
    
    /**
     * Returns true if this queue contains no elements.
     * @return The boolean value when the queue doesn't include a single method.
     */
    @Override
    public boolean isEmpty() 
    {
        return this.inQueue.isEmpty() && this.outQueue.isEmpty();
    }

    
    
    
    /**
     * Returns, but does not remove, the element at the front of this queue.
     * @return The element located at the front of the queue.
     */
    @Override
    public E peek() 
    {
        
        if (this.outQueue.isEmpty() && !this.inQueue.isEmpty()) 
        {
            
          while (!this.inQueue.isEmpty()) 
          {
             this.outQueue.push(this.inQueue.pop());
          }
          
         }
        
        else if (this.outQueue.isEmpty() && this.inQueue.isEmpty())
        {
            return null;
        }
        
        
        return this.outQueue.peek();
        
    }

   
    
    
    
}
