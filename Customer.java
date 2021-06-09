package tourism;
import java.util.*;
import java.lang.*;
public class Customer extends Main
{
	 String name;
	 int noOfMembers;
	 String emailID;
	 String phoneNo;
	 char membership;
	 char vegOptions;
	  int priority;
	  int selectedTour;
	  double totalamt;
	  double roomcharge;
	  double totalhotelc;
	 
	  Customer()
	  {
	     this.name = "";
	     this.noOfMembers = 0;
	     this.emailID = "";
	     this.phoneNo = "";
	     this.vegOptions = '0';
	     this.priority=0;
	     this.selectedTour=0;
	     this.totalamt=0.0;
	     this.roomcharge=0.0;
	     this.totalhotelc=0.0;
	  }

	  
	  Customer(String name,int noOfMembers,String emailID,String phoneNo,char membership,char vegOptions)
	  {
	     this.name = name;
	     this.noOfMembers = noOfMembers;
	     this.emailID = emailID;
	     this.phoneNo = phoneNo;
	     this.membership = membership;
	     this.vegOptions = vegOptions;
	     
	  }

	  public String getName() 
	  {
	        return name;
	  } 
	  
	  public int getPriority()
	  {
		  return priority;
		  
	  }
	  
	   public void displayBooking(int room[],int floor[],int n,int d)
	  {
	    System.out.println("The name is : "+this.name);
	    System.out.println("The email ID is : "+this.emailID);
	    System.out.println("The phone no. is : "+this.phoneNo);
	    System.out.println("Your membership is : "+this.membership);
	    System.out.println("Your food option is : "+this.vegOptions);
	    System.out.println("Total number of members registered : "+this.noOfMembers);
	    int i=0;
	    roomcharge=n*1000;
	    for(;i<n;i++)
	    {
	    if(room[i]!=-1&& floor[i]!=-1)
	    {
	    System.out.println("\nRoom allocated is:"+room[i]+" on floor:"+floor[i]);  
	   
	    }
	    }
	    totalhotelc=roomcharge*d;
	    System.out.println("\nTotal room charges for one day:"+roomcharge);
	    System.out.println("\nTotal room charges for all days:"+totalhotelc);
	  }
	   public void displayBooking()
		  {
		    
		    System.out.println("The name is : "+this.name);
		    System.out.println("The email ID is : "+this.emailID);
		    System.out.println("The phone no. is : "+this.phoneNo);
		    System.out.println("Your membership is : "+this.membership);
		    System.out.println("Your food option is : "+this.vegOptions);
		    System.out.println("Total number of members registered : "+this.noOfMembers);
		    System.out.println("Separate hotel room charges other than bill for entire tour: "+totalhotelc);  
		  }
	    public int acceptDetails(LinkedList<RegisteredUsers> ru1)
	    {
	          Scanner scad1 = new Scanner(System.in);
	          Scanner scad2 = new Scanner(System.in);
	          Scanner scad3 = new Scanner(System.in);
	          Scanner scad4 = new Scanner(System.in);
	          Scanner scad5 = new Scanner(System.in);
	          
	          int flag=0;
	         //***accepting details
	           do
	          {
	        	   
		             System.out.println("Enter your name :");
		             name = scad1.nextLine();
		              int c=0;
		               for(int j=0;j<name.length();j++)
		               {
		                 if(Character.isDigit(name.charAt(j)))
		                    c++;
		               }
		                  if(c!=0)
		                  {
		                      System.out.println("wrong name entered");
		                      continue;
		                   }
		                  else
		                    break;
		           }while(true);
	        	   
	        	   Iterator<RegisteredUsers> iter4 = ru1.iterator();
      		      while (iter4.hasNext()) 
      		      {
      		         RegisteredUsers temp1 = iter4.next();
      		         if(temp1.cname.compareTo(name)==0)
      		         {
      		        	 flag++;
      		        	membership=temp1.membership1;
      		        	 System.out.println(membership);
      			      break;
      		         }
      		       }
      		      if(flag==0)
      		    	System.out.println("Not found in registered users");
      	
	                    //***accepting email id
	                     do
	                     {
	                        System.out.println("Enter your email ID :");
	                        emailID = scad2.next();
	                        if(emailID.indexOf('@')==-1 || emailID.indexOf(".com")==-1)
	                        {
	                         System.out.println("Wrong email id entered try again");
	                         continue;
	                        }
	                       else
	                       break;
	                     }while(true);
	    
	                  //***accepting phone number
	                    do
	                    {
	                       System.out.println("Enter your phone number :");
	                        phoneNo = scad3.nextLine();
	                       int count=0;
	                      for(int j=0;j<phoneNo.length();j++)
	                       {
	                        if(Character.isDigit(phoneNo.charAt(j)))
	                        {
	                          count++;
	                         }
	                       }
	                      if(count==10)
	                       break;
	                       else
	                       {
	                        System.out.println("wrong contact number try again");
	                        continue;
	                       }
	                     }while(true);
	          
	                    //accepting number of members
	                    do
	                    {
	                      System.out.println("Enter no.of members registering :**(MIN 1 and MAX 25 allowed");
	                      noOfMembers = scad4.nextInt();
	                      if(noOfMembers>0 && noOfMembers<=25)
	                      {
	                        break;
	                      }
	                        else
	                        {
	                          System.out.println("Try again! number of members can be between 1 to 25 only"); 
	                           continue;
	                        }
	                   }while(true);
	    
	                
	            //***accepting veg or non veg option 
	                     do
	                     {
	                        System.out.println("Enter 'V' for veg and 'N' for non-veg :");
	                        vegOptions = scad5.next().charAt(0);
	                        vegOptions=Character.toUpperCase(vegOptions);
	                          if(vegOptions=='V'||vegOptions=='N')
	                           {
	                            break;
	                          }
	                       else
	                       {
	                        System.out.println("Incorrect information entered try again");
	                         continue;
	                        }
	                       
	                     }while(true); 
	                     
	                        System.out.println("Enter the tourid of the package you wish to select:");
	                        selectedTour=scad4.nextInt();
	                        if(selectedTour>=2100 && selectedTour<=2110)
	                        {
	                        	System.out.println("\n Tour id selected is valid");                       	
	                        	return selectedTour;
	                        }
	                        else
	                        {
	                        	System.out.println("\nIncorrect Tour id selected ");
	                        	System.out.println("\nCannot allocate tour");
	                        	return -1;
	                        }
	                        
	                        
	                
	    }//close accept()
	     void calculatePriority(int numberOfMembers,char membership)
	    {
	        
	         if(numberOfMembers>0 && numberOfMembers<5)
	        	 priority+=5;
	         else if(numberOfMembers>=5 && numberOfMembers<10)
	        	 priority+=10;
	         else if(numberOfMembers>=10 && numberOfMembers<15)
	        	 priority+=15;
	         else if(numberOfMembers>=15 && numberOfMembers<20)
	        	 priority+=20;
	         else if(numberOfMembers>=20 && numberOfMembers<=25)
	        	 priority+=25;
	               
	       
	        switch(membership)
	        {
	         case 'p':this.priority+=30;
	                   break;
	         case 'P':this.priority+=30;
	                  break;
	         case 'G':this.priority+=20;
	                  break;
	         case 'g':this.priority+=20;
	                  break;
	         case 's':this.priority+=10;
	                  break;
	         case 'S':this.priority+=10;
	                  break;
	         
	        }
       }//close calculatePriority()
	     
	        
	    int signupLogin(LinkedList<RegisteredUsers> ru5)
	     {
	    	 Scanner sc1=new Scanner(System.in);
             int choiceToContinue=1;
            //for existing account we can ask for password and if it matches then customer allowed to enter
            //linkedlist of users can contain name password if it matches then customer already has account
           int signUpMe;
               
         	   Scanner sc6=new Scanner(System.in);
            int flag=0;
            while(choiceToContinue!=0)
            {
            System.out.println("Enter name and password to login as a customer:");
            System.out.println("Enter name :");
            String n=sc6.nextLine();
            System.out.println("Enter password:");
            String p=sc1.next();
            //RegisteredUsers ru1=new RegisteredUsers(n,p);
            
            Iterator<RegisteredUsers>it=ru5.iterator();
            
            for(int i=0;i<ru5.size();i++) 
            {
         	   if(ru5.get(i).cname.compareToIgnoreCase(n)==0&&ru5.get(i).password.equals(p)) 
         	   {
         		   System.out.println("LOGIN SUCCESSFULL");
         		   flag=1;
         		   return 1;
         	   }
            }
            //int i=ru.indexOf(ru1);
            if(flag==0)
            {
            	Scanner sc9=new Scanner(System.in);
                System.out.println("Account not found");
                System.out.println("Try again");
                System.out.println("Do you want to signup? enter 2 for yes and 0 for no");
                signUpMe=sc9.nextInt();
                if(signUpMe==2)
                {
                	String customerName;
	                 String customerPassword;
	                 int flag1=0;
	                   System.out.println("You can create your Customer account here");
	                   System.out.println("Enter your name:");
	                   customerName=sc6.next();
	                  
	                                   
	                   System.out.println("Create password for your account:");
	                   customerPassword=sc6.next();
	                                      
	                   	                   
	                   RegisteredUsers ru2=new RegisteredUsers(customerName,customerPassword,'N');
	                   
	                    ru5.add(ru2);
	                   System.out.println("Account Successfully created!!");
	                   System.out.println("Now you can enter the tour portal as a customer");  
	                   //sc9.close();
	                   return 1;
	                  
                }
                
            }
             
            
            
            
          }
            return 0;
	     }
	   
	 
}
