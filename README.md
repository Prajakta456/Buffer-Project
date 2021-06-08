# Buffer-Project
The code is has 6 classes:Main,Tourpackage,Customer,Admin,Registered Users,CustomerComparator.

The Admin is given functionalities like
1)Add a tour package : The admin would enter the tour ID that he wants to add. If the tour ID already exists, validations are written . If he enters a new tour package, then it is correspondingly added to the LinkedList tours.

2)Delete a tour package : Admin has the power to delete a tour package. For this first he needs to enter the tour id correctly that he wants to delete and if he entered it correctly then using an iterator we are traversing the tour package till the desired Tour ID is found.

Once we reach the desired tour package to be deleted, we are deleting it using an inbuilt method remove() from LinkedList class.

3)Modify a tour package : This function modifies the tourpackage details, for the tour ID that the user enters

4)Display a tour package : Using iterator we are traversing the tourpackages and displaying their contents.

5)We have also written a function where the admin has the power to view the customers according to their priority in a tour package.

6)Admin finally allocates the customers and displays their discounted amount

The Customer can select a particular tour and based on the number of memebers and his membership the customers are given discounts.

The Customer class has various fields which will store the personal details, preferences and choices of the customer object as follows:  Name, email id, phone- number, no of members (a single person can register for a whole group)

The various functions of a Customer include- acceptDetails (To accept the personal details), displayBooking (To display the details, also, overloaded to display hotel booking details) and calculate Priority (To allot a numeric value to each customer on the basis of the size of group and membership)

Registered Users are the customers who have already registered and need not sign up. Any new Customer who has not registered will first be added to the Registered Users list and then can use the functionalities provided to a Customer.


Priority Queue has been implemented for giving the Customers discounts.




Future Scope of the Project:

We will be adding 
Database (MySql) can be used for storing the Tours and Customers data.

The customer can be given various travelling options like travelling by air,railway or road.

Website(Graphical User Interface) will be created for visual appeal and wider reach.

Exciting tour packages for international travel can be made available



Contributors:
Arundhati Korlahalli,Prajakta Deokule, Akhila Nori, Chinmayi Adsul


Mentor:Vallari Rajurkar

Arundhati Korlahalli-Customer functionalities 

Prajakta Deokule-Priority Queue and Main

Akhila Nori-Hotel booking 

Chinmayi Adsul-Tour package itineraries

The rest of the code was done by all of us together.
