package tourism;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{     	  
    	public static void main(String args[])throws IOException
	  {
    	System.out.println("=======================================================================================");	
	    System.out.println("WELCOME TO OUR TOURISM AGENCY");
	    System.out.println("=======================================================================================");
	    Scanner sc=new Scanner(System.in);
	    int floor=-1,room=-1,chhhh,inc=0;
	    
	    int tourIDselected,choiceToallot;
	     LinkedList<Tourpackage> tours = new LinkedList<Tourpackage>();
	     LinkedList<Customer>customer = new LinkedList<Customer>();
	    
	     int counterTourID=2108;
	     
	    
	     //*****add some tour packages here ie initialize them here some others can be shown as added by admin
	     /*variables in Tourpackage are int tourid,String citiesToVisit,int noOfDays,StringBuffer itinerary*/
	     //for reference
	        
	    
	     
	    StringBuilder sb0=new StringBuilder(1000);
	    sb0.append("\n*********************************************************\n\n2100)MAGICAL MANALI ");
	    sb0.append("\n\nDay 1 - Manali – Jagatsukh – Khanul\nVillage of Jagatsukh to Bahangan Nullah\nBahangan Nullah serves as your first day’s campsite. ");
	    sb0.append("\n\nDay 2 - Camping Site At Prini");
	    sb0.append("\n\nDay 3 - A trek of about five kilometres in The Himalayan Mountain ranges");
	    sb0.append("\n\nDay 4 - Adeventure attractions:\n1.Burma Bridge\n2. Commando Net");
	    sb0.append("\n\nDay 5 - The Mall Road and head back towards the central hill station of Manali.");  
	    sb0.append("\n\nDay 6 - Shopping and on-foot exploration of the hill station\nThen Manali – Delhi");
	    
	    
	    StringBuilder sb=new StringBuilder(1000);
	    sb.append("\n*********************************************************\n\n2101)HISTORICAL MAHARASHTRA");
	    sb.append("\n\nDay 1 - Arrival in Mumbai\nOn reaching Mumbai, check in at the hotel for the night");
	    sb.append("\n\nDay 2 - Sightseeing in Aurangabad\nPost breakfast,cover Elephanta Island and Elephanta Caves");
	    sb.append("\n\nDay 3 - Nashik Sightseeing\nCover Panchavati Temple, Kalaram Temple, Bhaktidham and Trimbakeshwar");
	    sb.append("\n\nDay 4 - Arrival to Shirdi\nVisit Sai Baba Mandir today");
	    sb.append("\n\nDay 5 - Visit Ajanta Caves\nEnjoy a visit to the rock cut Ajanta Caves today. ");
	    sb.append("\n\nDay 6 - Shirdi Sightseeing\nEnjoy a visit to the Ellora Caves today.");
	    
	    StringBuilder sb1=new StringBuilder(1000);
	    sb1.append("\n*********************************************************\n\n2102)AMAZING OOTY & MYSORE WITH BANGLORE");
	    sb1.append("\n\nDay 1 - Bangalore\n1.Bull Temple\n2.Commercial Street\n3.Vidhana Soudha\n4.Lal Bagh Botanical Garden\n5.Mysore Arts & Crafts Centre");
	    sb1.append("\n\nDay 2 - Bangalore to Mysore\n1.Mysore Palace\n2.Brindavan Gardens\n3.Chamundi Hills\n4.St. Philomena Church\n5.Mysore Zoo");
	    sb1.append("\n\nDay 3 - Mysore to Ooty\r\n1.Ooty Lake");
	    sb1.append("\n\nDay 4 - Ooty\n1.Sim's Park\n2.Lamb's Rock\n3.Dolphin's Nose\n4.Tea Museum\n5.Coonoor\n6.Doddabetta Peak\n7.Ooty Botanical Gardens");
	    sb1.append("\n\nDay 5 - Ooty to Bangalore");
        
	    
	    StringBuilder sb2=new StringBuilder(1000);
	    sb2.append("\n*********************************************************\n\n2103)COLOURFULL RAJASTHAN");
	    sb2.append("\n\nDay 1 - Arrival in Jaipur");
	    sb2.append("\n\nDay 2 - Sightseeing in Jaipur\n1.Amer Fort");
	    sb2.append("\n\nDay 3 - Jaipur to Jodhpur\nSightseeing in Jaisalmer\n1.Umaid Bhawan Palace");
	    sb2.append("\n\nDay 4 - Jodhpur to Jaisalmer\n1.Mehrangarh Fort\n2.Jaswant Thada");
	    sb2.append("\n\nDay 5 - Jaisalmer\nSightseeing in Jaisalmer\n1.Nathdwara\n2.Patwaon ki Haveli\n3.Sam Sand Dunes");
	    sb2.append("\n\nDay 6 - Jaisalmer to Udaipur(travel)");
	    sb2.append("\n\nDay 7 - Udaipur\nSightseeing in Udaipur\n1.Saheliyon ki Bari\n2.City Palace\n3.Sajjangarh Palace");
	    sb2.append("\n\nDay 8 - Departure from Udaipur\nBreakfast at Hotel in Udaipur");
                  
	          
	    StringBuilder sb3=new StringBuilder(1000);
	    sb3.append("\n*********************************************************\n\n2104)AMAZING GOA");
	    sb3.append("\n\nDay 1 - NORTH GOA FORTS & BEACHES\n1.Reis Mogos Fort\n2.Aguada Fort\n3.Calangute Beach\n4.Chapora Fort\n5.Vagator Beach");
	    sb3.append("\n\nDAY 2 - DUDHSAGAR FALLS");
	    sb3.append("\n\nDay 3 - OLD GOA & TEMPLES\n1.Basilica Of Bom Jesus\n2.Se Cathedral\n3.St. Francis Of Assisi Church\n4.St. Augustine Tower / Church Of St. Augustin\n 5.Shri Mangueshi Temple / Mangeshi Temple");
	    
	    
	    StringBuilder sb4=new StringBuilder(1000);
	    sb4.append("\n*********************************************************\n\n2105)UNPARRALLED KERELA");
	    sb4.append("\n\nDAY 1- Kochi\nDay at Leisure");
	    sb4.append("\n\nDAY 2 and 3 - Munnar\n1.Visit Eravikulam National Park\n2.Visit to Tea Museum\n3.Visit to Mattupetty Dam\n 4.Visit to Eco Point\n5.Visit to Flower Garden");
	    sb4.append("\n\nDAY 4 -Kumarakom\nDay at Leisure");
	    
	    
	    StringBuilder sb5=new StringBuilder(1000);
	    sb5.append("\n*********************************************************\n\n2106)MESMERIZING KEDARNATH");
	    sb5.append("\n\nDAY 1 - Dehradun\nExplore on your own");
	    sb5.append("\n\nDAY 2 - Yamunotri\n1.Yamunotri Temple\n2.Shani Temple");
	    sb5.append("\n\nDAY 3 - Gangotri\n1.Gangotri Temple");
	    sb5.append("\n\nDAY 4 - Kedarnath\n1.Visit Kedarnath Temple");
	    sb5.append("\n\nDAY 5 - Badrinath\n1.Visit Badrinath Temple");
	    
	    StringBuilder sb6=new StringBuilder(1000);
	    sb6.append("\n**********************************************************\n\n2107)OFFBEAT ANDAMAN");
	    sb6.append("\n\nDAY 1 - Arrival at Port Blair\n1.Cellular Jail Visit");
	    sb6.append("\n\nDAY 2 - Port Blair| Bartang | Rangat | Mayabunder | Diglipur\n1. Jarawa Reserve\n2.Mud Volcano \n3.Limestone cave \n4.Aamkunj Beach\n 5.Brake water\n6.Panchabati Fall\n7.Cutbery beach ");
	    sb6.append("\n\nDAY 3 - Mayabunder | Diglipur\n1.Kalipur beach\n2.Mayabunder Islands\n3.Karmatang beach");
	    sb6.append("\n\nDAY 4 - Mayabunder | Port Blair\n1.Shopping");
	    sb6.append("\n\nDAY 5 - Port Blair to Havelock");
	    sb6.append("\n\nDAY 6 - Explore Havelock\n1.Radhanagar Beach \n2.Water sports.");
	    sb6.append("\n\nDAY 7 - Havelock to Port Blair\n1.Elephant Beach \n");
	    sb6.append("\n\nDAY 8 - Check out and Return");
	    
	   
	    tours.add(new Tourpackage(2100,"Manali, Jagatsukh, Bahangan Nullah",6,sb0,"Magical Manali",10000));        
	    tours.add(new Tourpackage(2101,"Mumbai, Nashik, Aurangabad ,Shirdi",6,sb,"Historical Maharashtra",9000));        
	    tours.add(new Tourpackage(2102,"Bangalore, Mysore, Ooty",5,sb1,"Amazing Ooty and Mysore with Banglore",15000));        
	    tours.add(new Tourpackage(2103,"Jaipur, Jodhpur, Jaisalmer, Udaipur",8,sb2,"Colourful Rajasthan",14000));        
	    tours.add(new Tourpackage(2104,"Panaji, Candolim, Goa Velha",3,sb3,"Amazing Goa",10000));
	    tours.add(new Tourpackage(2105,"Kochi, Munnar, Kumarakor",4,sb4,"Unparalleled Kerala",13000));    
	    tours.add(new Tourpackage(2106,"Kedarnath, Badrinath",5,sb5,"Mesmerizing Kedarnath",16000));    
	    tours.add(new Tourpackage(2107,"Port Blair, Mayabundar",8,sb6,"Offbeat Andaman",15000));     
	    
	    
	    
	   
	    //Initializing already registered customers
	   //create linked list called Registered Users
	    LinkedList<RegisteredUsers> ru= new LinkedList<RegisteredUsers>();
	    ru.add(new RegisteredUsers("Narayani Baheti","hello123",'G'));
	    ru.add(new RegisteredUsers("Pallavi Kulkarni","hello456",'P'));
	    ru.add(new RegisteredUsers("Sahil Shah","hello789",'p'));
	    ru.add(new RegisteredUsers("Shruti Deshpande","hello110",'S'));
	    ru.add(new RegisteredUsers("Mihir Dorkhande","hello220",'P'));
	    ru.add(new RegisteredUsers("Kartik Gupta","hello330",'P'));
	    ru.add(new RegisteredUsers("Anushka Raman","hello440",'G'));                   
	    ru.add(new RegisteredUsers("Pravin Sharma","hello550",'s'));   
	    ru.add(new RegisteredUsers("Ameya Bondre","hello660",'g'));   
	    ru.add(new RegisteredUsers("Sagar Chawla","hello770",'p'));   
	    ru.add(new RegisteredUsers("Anagha Rawat","hello880",'G'));   
	    ru.add(new RegisteredUsers("Aditi Jain","hello990",'s'));   
	    int choice;
	                 do
	                 {
	                  System.out.println("1.Login as a Admin");
	                  System.out.println("2.Login as a Customer");
	                  System.out.println("3.Exit");
	                  choice=sc.nextInt();
	                  switch(choice)
	                  {
	                   case 1://admin  
	                           // Declaring Array with  size n for storing admins info
	                           ArrayList<Admin>alist = new ArrayList<Admin>();
	                             Admin a1=new Admin("Prajakta","admin101@11");
	                             alist.add(a1);
	                             Admin a2=new Admin("Arundhati","admin102@22");
	                             alist.add(a2);
	                             Admin a3=new Admin("Akhila","admin103@33");
	             	             alist.add(a3);
	             	            Admin a4=new Admin("Chinmayi","admin104@44");
	             	             alist.add(a4);
	                          
	                         // Appending new elements at the end of the list
	                          
	             	            char ch='y';
	             	            do
	             	             {  
	             	              System.out.println("Welcome to Login Page for ADMINS");          //accept name and security key to allow admin to login
	             	              System.out.println("Enter your name to login:");
	             	              String adname=sc.next();
	             	               System.out.println("Enter security key (password) to login:");
	             	               String key=sc.next();
	             	               Admin obj=new Admin(adname,key);
	             	              int counter=0;
	             	               //int indexad = alist.indexOf(obj);
	             	              for(int i=0;i<alist.size();i++) {
	             	            	  if(alist.get(i).adminName.equalsIgnoreCase(adname)&&alist.get(i).securityKey.equals(key)) {
	             	            		 System.out.println("LOGIN SUCCESFUL AS ADMIN");
	             	            	     break;}
	             	              
	             	              else {
	             	                     counter++;
	             	                  }
	             	                 
	             	             }
	                                
	                              
	     
	                                      
	              
	              if(counter<4)                     
	               {  int choice1;
	                   do
	                   {
	                  System.out.println("**************************************************************************");
	                  System.out.println("Welcome to Admin Page:");
	                  System.out.println("***************************************************************************");
	                  System.out.println("1.Add a tour package");
	                  System.out.println("2.Delete a tour package");
	                  System.out.println("3.Modify a tour package");
	                  System.out.println("4.Display a tour package");
	                  System.out.println("0.Allocate customers finally");
	                  System.out.println("6.Exit");
	                  
	                  System.out.println("***************************************************************************");
	                
	                   //accept choice from admin
	                  System.out.println("Enter your choice:");
	                  choice1=sc.nextInt();
	                   int tr,chstop;
	                  switch(choice1)
	                  {
	                    case 0:
	                    	do
	            	    	{
	            	        System.out.println("\nEnter tour id to allocate its customers prices:");
	            	        tr=sc.nextInt();
	            	        for(int i=0;i<tours.size();i++)
	            	        {
	            	        if(tr==tours.get(i).tourid)
	            	        {
	            	           if(tours.get(i).isFilled==true)
	            	          {             
	            	        	  inc++;
	            	        	 tours.get(i).Discounted(tr);  
	            	          }
	            	           else
	            	        	   System.out.println("Try again later to see discount");
	            	        }
	            	        }
	            	        System.out.println("Do you want to continue?(press 1)");
	         	    	    chstop=sc.nextInt();
	         	            }while(chstop==1);
	         	            break;
	                    case 1://under add package
	                    	  
	                          Tourpackage tp1=new Tourpackage();
	                          tp1.createPackage(counterTourID);
	                          counterTourID++;
	                          tours.add(tp1);
	                          System.out.println("\nTour package added!!");                            
	                    	  
	                          break;
	                          
	                    case 2://delete tour package 
	                         // tourpackage.deletepackage();
	                            System.out.println("Enter the tour ID to be deleted");
	                            int ide = sc.nextInt();
	                            int index=-1,c=0;
	                            Iterator<Tourpackage> iterator=tours.iterator();
	                           while(iterator.hasNext())
	                           {
	                               index++;
	                               //System.out.println(index);
	                             if(ide == iterator.next().tourid)
	                               {
	                                  c++;
	                                  break;
	                               }
	                             //iterator.next().display();
	                            }
	                            if(c==0)
	                            {
	                              System.out.println("Tour ID not found");
	                            }
	                           else
	                           {
	                             tours.remove(index);
	                            System.out.println("Package deleted successfully");
	                           }
	                            
	                    
	                           break; 
	                    case 3://modify tour package
	                           //tourpackage.modifypackage();
	                    	   int flag=0;
	                    	   Tourpackage temp=new Tourpackage();
	                           System.out.println("Enter the tourid of the package to be modified");
	                           int tpmod = sc.nextInt();
	                           for(int i=0;i<tours.size();i++) {
	                        	    temp=tours.get(i);
	                        	    if(temp.tourid==tpmod) {
	                        	    	flag=1;
	                        	    	System.out.println("Package found");
	                        	        break;
	                        	    }
	                        	    }
	                           
	                           if(flag==1) {
	                        	   StringBuilder it=new StringBuilder(1000);
	                        	   String storestr[];
	                        	   Scanner local=new Scanner(System.in);
	                        	   Scanner local1=new Scanner(System.in);
	                        	   System.out.println("Enter the tour name of new package");
	                                temp.tourname=local.nextLine();
	                                
	                                System.out.println("Enter the tour package price for one member");
	                                temp.priceOftourpermember=local1.nextInt();
	                                
	                        	   System.out.println("Enter the cities to visit(Enter one after another)");
	                                temp.citiesToVisit=local.next();
	                                
	                               System.out.println("Enter the number of days of the new package");
	                                temp.noOfDays=local1.nextInt();
	                                
	                                System.out.println("Enter the itinerary details");
	                                System.out.println("Enter the number of lines you want to enter");
	            	                int l=local1.nextInt();
	            	                storestr=new String[l+1];
	            	                
	            	                for(int i=0;i<l+1;i++)
	            	                {
	            	                	storestr[i]=local.nextLine();
	            	                	
	            	                }
	            	                it=new StringBuilder("\n*********************************************************\n\n"+temp.tourid+")"+temp.tourname);
	            	                for(int i=0;i<l+1;i++)
	            	                {
	            	                	it.append("\n\n"+storestr[i]);
	            	                }
	                                temp.itinerary=it;
	                                //temp.itinerary.append(sc.nextLine());
	                                
	                                tours.set(temp.tourid%100, temp);
	                                for(int i=0;i<tours.size();i++) {
	                               	 tours.get(i).displayPackage();
	                               	 
	                                }
	                           }
	                           else
	                        	System.out.println("Package not found");
	                      
	                          break;
	                    case 4://display a package
	                           System.out.println("Enter the tour id of the tour package to be displayed:");
	                           ide=sc.nextInt();
	                             int index1=-1,c1=0;
	                            Iterator<Tourpackage> iterator1=tours.iterator();
	                           while(iterator1.hasNext())
	                           {
	                               index1++;
	                               //System.out.println(index);
	                             if(ide == iterator1.next().tourid)
	                               {
	                                  c1++;
	                                  break;
	                               }
	                             
	                            }


	                            if(c1==0)
	                            {
	                              System.out.println("Tour ID not found");
	                            }

	                           else
	                           {
	                              Tourpackage tp2;
	                              System.out.println("***************************************************************************");
	          	                 System.out.println("\nThe tour details are as follows ");
	                             tp2=tours.get(index1);
	                             System.out.println("\nThe tourid of the package is "+tp2.tourid+"\nThe name of the tour package is "+tp2.tourname+"\nThe cities to visit of the package are "+tp2.citiesToVisit+"\nThe number of days of the package is "+tp2.noOfDays+"\nThe itinerary of the package is "+tp2.itinerary);
	                             System.out.println("***************************************************************************");
	         	                
	                           }
	                           
	                      
	                          break;
	                          
	                    case 6:System.out.println("\nExited");         
	                    default:System.out.println("Wrong choice Try again");
	                          break;
	                          
	                }//close switch
	               }while(choice1!=6);//close do while
	               }
	              else
	            	System.out.println("Name or security key is incorrect so cannot allow to login");
	               
	                 //if admin key is wrong try again
	                 
	                 System.out.println("Do you wish to try again to login as admin?");
	                 System.out.println("If yes enter y else enter n");
	                 //do you want to continue
	                 // accept ch as y or n
	                   ch=sc.next().charAt(0);
	                 
	               
	               }while(ch!='n');
	             	break;            
	         case 2://customer
	        	  int chh;
	               do
	               {  Customer c1=new Customer();
	                   Scanner sch=new Scanner(System.in);
	                   int signed;
	                 //1.create new account 
	                 //2.login exiting account
	                 //3.exit
	                 System.out.println("**************************************************************************");
	                 System.out.println("Welcome To Customer's Login Page");
	                 System.out.println("**************************************************************************");
	                 System.out.println("As a customer:");
	                 System.out.println("1.Create/Login Account");
	                 System.out.println("2.Exit");
	                 System.out.println("***************************************************************************");
	                 //accept choice chh
	                 System.out.println("Enter your choice:");
	                 chh=sch.nextInt();
	           
	                 if(chh==1)
	                 {
	                    signed=c1.signupLogin(ru);
	                   
	                 
	                 
	                 
	                 //once customer enters tourism portal
	                 System.out.println("*****************************************************************************");               
	                 System.out.println("Tour package details are as follows:");
	                                
	                      
	                 //display all the nodes of tourpackage linkedlist 
	                 for(int i=0;i<tours.size();i++) 
	                 {
	                	 tours.get(i).displayPackage();
	                	 
	                 }
	                 
	               
	               //ask user for choice that is which tour he wants to book 
	               do 
	               {
	                  Customer customer1=new Customer();
	                  System.out.println("**********************************************************************");
	              	 System.out.println("Customer's Menu:");
	              	System.out.println("\n1.Display a tour package");
	              	System.out.println("\n2.Grab a slot in any tour?");
	                System.out.println("\n4. Exit:");
	                System.out.println("**********************************************************************");
	                 System.out.println("\nEnter choice:");
	                 Scanner sss=new Scanner(System.in);
	                 chhhh=sss.nextInt();
	                 switch (chhhh) {
	                 case 1:
	                 {
	                	//display a package
                         System.out.println("Enter the tour id of the tour package to be displayed:");
                         int ide1=sc.nextInt();
                           int index11=-1,c11=0;
                          Iterator<Tourpackage> iterator9=tours.iterator();
                         while(iterator9.hasNext())
                         {
                             index11++;
                             //System.out.println(index);
                           if(ide1 == iterator9.next().tourid)
                             {
                                c11++;
                                break;
                             }
                           
                          }


                          if(c11==0)
                          {
                            System.out.println("Tour ID not found");
                          }

                         else
                         {
                            Tourpackage tp2;
                            System.out.println("***************************************************************************");
        	                 System.out.println("\nThe tour details are as follows ");
                           tp2=tours.get(index11);
                           System.out.println("\nThe tourid of the package is "+tp2.tourid+"\nThe name of the tour package is "+tp2.tourname+"\nThe cities to visit of the package are "+tp2.citiesToVisit+"\nThe number of days of the package is "+tp2.noOfDays+"\nThe itinerary of the package is "+tp2.itinerary);
                           System.out.println("***************************************************************************");
       	                
                         }
                         
                    
                        break;
                      }
	                 case 2:
	                 {//ACCEPT USER DETAILS HERE VIA A FUNCTION
	                  
	                   int checker=customer1.acceptDetails(ru);        
	                   System.out.println("\nConfirm tour ID to book a tour");
	                   tourIDselected=sc.nextInt();
	                   
	                   
	                   if(checker>=2100 && checker<=2110 && checker==tourIDselected)
	                   {                 
		                 //then priority calculation function will be called 
	                   
	                   customer1.calculatePriority(customer1.noOfMembers,customer1.membership);
	                  
	                   
	                   
	                   
	                   int i=-1,counter=0;
	                   Iterator<Tourpackage> iterator=tours.iterator();
                       while(iterator.hasNext())
                       {
                           i++;
                           //System.out.println(index);
                         if(checker == iterator.next().tourid)
                           {
                              counter++;
                              break;
                              
                           }
                         }
                        if(counter==0)
                        {
                          System.out.println("\nCannot do hotel booking tour not avaialble");
                        }
                       else
                       {
                    	  customer1.totalamt=customer1.noOfMembers*tours.get(i).priceOftourpermember;
                         tours.get(i).displayHotel();
                         System.out.println("\nEnter the number of rooms you want to allocate:");
                         int nr=sc.nextInt();
                         int floor1[]=new int[nr];
                         int room1[]=new int[nr];
                         
                         for(int t=0;t<nr;t++)
                         {
                        	 for(int j=0;j<nr;j++)
                        	 {
                        		 floor1[t]=-1;
                        		 room1[t]=-1;
                        	 }
                         }
                         
                         int countroom=0,ct=0;
                         if(nr<=tours.get(i).availablerooms)
                         {
                        	 for(int pr=0;pr<nr;pr++)
                        	 {
                        		 System.out.println("\nEnter the floor number:");
                                 floor=sc.nextInt();
                                 System.out.println("Enter the room number:");
                                 room=sc.nextInt();
                                 int available=tours.get(i).checkAvailability(floor,room);
                                 if(available==1)
                                 {
                                 System.out.println("\nRoom succesfully allocated");
                                 floor1[ct]=floor;
                                 room1[ct]=room;
                                 countroom++;
                                 tours.get(i).availablerooms--;
                                 ct++;
                                 }
                                 else if(available==5)
                                 {
                                	 System.out.println("Could not allocate room");
                                	 floor1[ct]=-1;
                                	 room1[ct]=-1;
                                 }
                                 
                                 customer.add(customer1);
                                 tours.get(i).displayHotel();
                        	 }
                         }
                         else
                         System.out.println("\n"+nr+" Rooms not available");
                         
                         if(tours.get(i).pq.size()<5)
                         {
                          	 
                         tours.get(i).pq.add(customer1);
                         System.out.println("You are successfully added to priority queue of Tour:"+tours.get(i).tourid);
                         if(tours.get(i).pq.size()==5)
                         {
                        	 tours.get(i).isFilled=true;
                         }
                         customer1.displayBooking(room1,floor1,countroom,tours.get(i).noOfDays);
                         break;
                         }
                         else
                         {
                        	 System.out.println("Tour package Booking full! Cannot allocate"); 
                         }
                         }
	                  }
	                   break;
	                 }
	                 
	                
	                 }  
	               }while(chhhh!=4);    
	               
	                 }//closing do while of customer
	               
	               else if(chh==2)
	                 {
	                	 System.out.println("Exit");
	                     break;
	                     
	                 }
	                 else
	                 {
	                   //chh is other than 1,2,3
	                   System.out.println("Invalid choice");
	                   continue;
	                  
	                 } }while(chh!=2);
	              
	               case 3:System.out.println("Thank you for visting us");
	                      break;
	               default:System.out.println("Wrong choice TRY AGAIN");
	                       break;
	                  }
	                }while(choice!=3);
	                 
	               
	                 System.out.println("\n!!!!THANK YOU!!!!");
	                 System.out.println("\nExited");
	        }//close main function
	}//close main class
