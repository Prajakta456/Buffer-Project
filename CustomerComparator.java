package tourism;
import java.util.*;
public class CustomerComparator implements Comparator<Customer>
	
	 {
        
        //Overriding compare()method of Comparator 
        //for descending order of priority
                  
	//when a positive value is returned by the compare method the items swap
   		@Override
		public int compare(Customer c1, Customer c2) 
   		{	
	            if (c1.priority< c2.priority)
	                return c2.priority-c1.priority;
	            else if (c1.priority > c2.priority)
	                return c2.priority-c1.priority;
	   
			return 0;
		}
	
	 }
	
	
	
	
	
	
	
