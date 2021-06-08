package tourism;
import java.util.*;
public class CustomerComparator implements Comparator<Customer>
	
	 {
        
        //Overriding compare()method of Comparator 
        //for descending order of priority
                  
   		@Override
		public int compare(Customer c1, Customer c2) 
   		{
			// TODO Auto-generated method stub	
	            if (c1.priority< c2.priority)
	                return 1;
	            else if (c1.priority > c2.priority)
	                return -1;
	   
			return 0;
		}
	
	 }
	
	
	
	
	
	
	
