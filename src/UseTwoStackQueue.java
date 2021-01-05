import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Marissa Gonçalves
 * Due Date: October 24, 2018
 * Runs and tests the TwoStackQueue class, which is implemented from the MyQueueI interface.
 */

public class UseTwoStackQueue 
{

    /**
     * Runs and tests the TwoStackQueue class, which is implemented from the MyQueueI interface.
     * @param args The classic name given for a String array of a main class.
     */ 
    public static void main(String[] args) 
    {
        
        
        List<String> listString = new ArrayList<>();
        listString.add("One");
        listString.add("Two");
        listString.add("Three");

        
	List<String> linkedString = new LinkedList<>(listString);
        linkedString.add("End of Linked List");
		
        
        TwoStackQueue<String> Q1 = new TwoStackQueue<>();
        TwoStackQueue<String> Q2 = new TwoStackQueue<>(listString);
        TwoStackQueue<String> Q3 = new TwoStackQueue<>(linkedString);
        TwoStackQueue<Integer> Q4 = new TwoStackQueue<>();
		
        
        
        Q1.enqueue("First"); 
        Q1.enqueue("Second"); 
        Q1.enqueue("Third"); 
        Q2.enqueue("Four");
        System.out.println("The element at the front of Q3: " + Q3.peek());
        Q4.enqueue(200);
        Q4.enqueue(100);
        Q4.enqueue(500);	
        Q4.enqueue(50);
	
        
        
        System.out.println(" ******** Dequeue the Stack Q1:");
        
        while (!Q1.isEmpty())	
        {
            System.out.print(" " + Q1.dequeue());
        }

        
        
        
        System.out.println(" \n ******** The first element to dequeue in Q2:");	
	System.out.print(" " + Q2.dequeue());
 
        
        

        System.out.println(" \n ******** Dequeue the Stack Q3:");	
        
        while (!Q3.isEmpty())	
        {
           System.out.print(" " + Q3.dequeue());
        }

        
        
        
        System.out.println(" \n ******** Dequeue the Stack Q4:");
        
        while (!Q4.isEmpty())	
        {
           System.out.print(" " + Q4.dequeue());
        }

        System.out.println();
        
    }
    
}
