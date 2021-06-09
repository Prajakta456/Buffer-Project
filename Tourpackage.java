package tourism;
import java.util.*;
public class Tourpackage 
{
	   int tourid;
	   String tourname;
	   String citiesToVisit;
	   int noOfDays;
	   int priceOftourpermember;
	   boolean isFilled;
	  // LinkedList<Accounts> d = new LinkedList<Accounts>();
	   
	   int availablerooms=12;
	   
	   //in each city of each tour we have similar structure hotel
	   //it is a chain of hotels all over the country
	   //price per day of 1 room is 1000
	   int hotel[][]= { {0,0,0,1,0,1},
	                    {1,0,0,0,1,0},
	                    {0,0,1,0,1,0},
	                    {1,0,0,0,0,0},
	                    {1,0,0,0,0,0},
	                    {1,0,0,0,0,0}};
       
	 //all tour packages priority queues will be created 
	  //right now only 5 customers are allowed in a tour package queue
	  //scope can be increase
	  PriorityQueue<Customer> pq = new PriorityQueue<Customer>(5, new CustomerComparator());
	
	   StringBuilder itinerary=new StringBuilder(1000);
	   Tourpackage()
	   {
	       this.tourid=0;
	       this.citiesToVisit= "";
	       this.noOfDays=0;
	       this.itinerary=null;    
	       this.tourname="";
	       this.priceOftourpermember=0;
	       this.isFilled=false;
	   }
	   
	  void displayHotel()
	  {
		  System.out.println("0 stands for available room and 1 for occupied room");
	       for(int j=0;j<6;j++)
               {
		System.out.println("Number of rooms in floor:"+j);
        	System.out.println("->");
        	for(int k=0;k<6;k++)
        	{
        		System.out.print(hotel[j][k]+"  ");
        	}
        	System.out.println();
              }
	  }
	  
	  
	  int checkAvailability(int f,int r)
	  { 
		  if(hotel[f][r]==0)
		  {
			 hotel[f][r]=1;
			 return 1;
		  }
				  
		  return 5;		
	
	  }
	
	   int getTourId()
	   {
		   return tourid;
	   }
	
	  Tourpackage(int tourid,String citiesToVisit,int noOfDays,StringBuilder itinerary,String tourname,int priceOftourpermember)
	  {
	      this.tourid=tourid;
	      this.citiesToVisit= citiesToVisit;
	      this.noOfDays=noOfDays;
	      this.itinerary=itinerary;
	      this.tourname=tourname;
	      this.priceOftourpermember=priceOftourpermember;
	  }
	 
	    public void createPackage(int id)
	   { 
	    	       String storestr[];
	    	       
	               Scanner sc=new Scanner(System.in);
	               Scanner sc2=new Scanner(System.in);
	               Scanner sc3=new Scanner(System.in);
	               tourid=id;
	               System.out.println("Tour id of new package is assigned as "+id);
	               
	               System.out.println("Enter the tour name of new package");
	                tourname=sc2.next();
	                
	                System.out.println("Enter the price of the tour package per member");
	                priceOftourpermember=sc.nextInt();
	                
	               System.out.println("Enter the cities to visit(Enter one after another)");
	               citiesToVisit=sc3.nextLine();
	               
	               System.out.println("Enter the number of days of the new package");
	                noOfDays=sc.nextInt();
	              
	                System.out.println("Enter the itinerary details");
	                
	                System.out.println("Enter the number of lines you want to enter");
	                int l=sc.nextInt();
	                storestr=new String[l+1];
	                
	                for(int i=0;i<l+1;i++)
	                {
	                	storestr[i]=sc2.nextLine();
	                	
	                }
	                itinerary=new StringBuilder("\n*********************************************************\n\n"+tourid+")"+tourname);
	                for(int i=0;i<l+1;i++)
	                {
	                	itinerary.append("\n"+storestr[i]);
	                }               
	               
	     
	   }
	  
	   public void displayPackage()
	   {  //We have to display number of customers in the priority queue
		   System.out.println("**************************************************");
		   System.out.println("\nTour name  is:"+tourname);
		   System.out.println("\nTour id is:"+tourid);
		   System.out.println("\nCities to visit are:"+citiesToVisit);
		   System.out.println("\nNumber of days of the tour :"+noOfDays);
		   System.out.println("\nThe price per member is:"+priceOftourpermember);
		   System.out.println("\nThe itinerary is:"+itinerary);
		   System.out.println("**************************************************");
	   }
	   public void Discounted(int id)
	    {
		   double finalAmt=0.0;
	    	Scanner me=new Scanner(System.in);
	        int chstop,tr;	
	        int countCust=-1;
	    	 while(!pq.isEmpty())
	           {
	           countCust++;
	           Customer c5;
	           c5=pq.poll();
	           if(countCust==0||countCust==1)
               {
	        	System.out.println("**********************************************************************");
	        	c5.displayBooking();   
               c5.totalamt=c5.totalamt-0.3*c5.totalamt;
               System.out.println("THE CUSTOMER'S BILL IS(without hotel charges):"+c5.totalamt);
               finalAmt=c5.totalamt+c5.totalhotelc;
               System.out.println("BILL INCLUDING HOTEL CHARGES IS"+finalAmt);
               System.out.println("**********************************************************************"+"\n\n");
               }
               else if(countCust==2)
               {
            	System.out.println("**********************************************************************");   
            	c5.displayBooking();    
               c5.totalamt=c5.totalamt-0.2*c5.totalamt;
               System.out.println("THE CUSTOMER'S BILL IS(without hotel charges) :"+c5.totalamt);
               finalAmt=c5.totalamt+c5.totalhotelc;
               System.out.println("BILL INCLUDING HOTEL CHARGES IS"+finalAmt);
               System.out.println("**********************************************************************"+"\n\n");
               }
               else if(countCust==3)
               {
            	System.out.println("**********************************************************************");
            	c5.displayBooking(); 
               c5.totalamt=c5.totalamt-0.1*c5.totalamt;
               System.out.println("THE CUSTOMER'S BILL IS(without hotel charges):"+c5.totalamt);
               finalAmt=c5.totalamt+c5.totalhotelc;
               System.out.println("BILL INCLUDING HOTEL CHARGES IS"+finalAmt);
               System.out.println("**********************************************************************"+"\n\n");
               }
                else if(countCust==4)
                {
               System.out.println("**********************************************************************");
               c5.displayBooking(); 
               c5.totalamt=c5.totalamt-0.05*c5.totalamt;
               System.out.println("THE CUSTOMER'S BILL IS(without hotel charges):"+c5.totalamt);
               finalAmt=c5.totalamt+c5.totalhotelc;
               System.out.println("BILL INCLUDING HOTEL CHARGES IS"+finalAmt);
               System.out.println("**********************************************************************"+"\n\n");
                }
	          
             }
	  }
	    	
	          
	   
}

