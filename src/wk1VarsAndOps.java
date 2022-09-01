
public class wk1VarsAndOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create var for availabe plane seats
		int availablePlaneSeats = 6;
		// var for cost of groceries
		double costOfGroceries = 23.64;
		// var to hold a single character
		char middleInitial = 'M';
		// var for true false boolean
		boolean isHostOutside = false;
		// var hold customers first name
		String customersFirstName = "Billy";
		// var hold street address
		String streetAddress = "1313 MockingBird Lane";
		
		//print out all vars
		System.out.println(availablePlaneSeats);
		System.out.println("dCost of the groceris are:" + " " + costOfGroceries);
		System.out.println("My Middle initial is:" + " " + middleInitial);
		System.out.println("Is it hot outside?" + " " + isHostOutside);
		System.out.println("Customers first name is:" + " " + customersFirstName);
		System.out.println("My address is:" + " " + streetAddress);
		
		// a customer booked 2 plane seats, remove 2 seats from the available seats variable
		availablePlaneSeats = availablePlaneSeats -2;
		availablePlaneSeats -= 2;
		System.out.println(availablePlaneSeats);
		
		//impulse candy bar purchase, add 2.15 to the grocery total
		//costOfGroceries = costOfGroceries -1;
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);
		
		//birth certificate was printed incorrectly, change the middle initial to something else
		middleInitial = 'T';
		System.out.println(middleInitial);
		
		// the season has changed, update the hot outside var to be opposite of what it was
		isHostOutside = !isHostOutside;
		System.out.println(isHostOutside);
		
		//create a new var called full name using the customers first, the middle initial, and a last name of your choice
		String fullName = customersFirstName + " " + middleInitial + " Charter";
		System.out.println(fullName);
		
		//print a line to the console that introduces the customer and says they live at the address variable
		System.out.println(" Hi, my name is " + fullName + " and I live at " + streetAddress + ".");
				
		
		
		
	}

}
