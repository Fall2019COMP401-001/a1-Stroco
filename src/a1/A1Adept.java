package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// create a class representing items available and their prices
		class ItemStuff {
			String foodies = "";
			double price = 0;
		}
		// create a class representing customers and amount of money they spend
		class Customers {
			String fname = "";
			String lname = "";
			double totalPrice = 0;
		}
		// set initial value for "biggest" and "average" to be used later
		double biggest = Double.MIN_VALUE;
		double average = 0;
		double smallest = Double.MAX_VALUE;
		int a = 0,b = 0;
		// create count of how many items are in the store
		int itemcount = scan.nextInt();
		// create an array to store each item along with their properties (name and price)
		ItemStuff storeItems[] = new ItemStuff[itemcount];
		for (int i=0; i<itemcount; i++) {
			ItemStuff items = new ItemStuff();
			items.foodies = scan.next();
			items.price = scan.nextDouble();
			storeItems[i] = items;
		}
		// create a count for the number of customers
		int peoples = scan.nextInt();
		// create an array to store each customer and their orders
		Customers custItems[] = new Customers[peoples];
		// a for loop that goes through the customers and their orders one at a time
		for (int j=0; j<peoples; j++) {
			Customers custnames = new Customers();
			custnames.fname = scan.next();
			custnames.lname = scan.next();
			custItems[j] = custnames;
			// create a count for amount of items bought by customer
			int ibuy = scan.nextInt();	
			// new variable in for loop to loop through each item bought
			for (int x=0; x<ibuy; x++) {
				// indicate how much of each item was bought
				int amount = scan.nextInt();
				// sets a name for each item bought to relate to their price
				String itemname = scan.next();
				for (int i = 0; i < itemcount; i++) {
					if (itemname.contentEquals(storeItems[i].foodies) ) {
						custItems[j].totalPrice += amount * storeItems[i].price;
					}
				}
				}
		}
		for (int j = 0; j<peoples; j++) {
			average += custItems[j].totalPrice;
		}
	
		
	for (int j = 0; j<peoples; j++ ) {
			if (custItems[j].totalPrice > biggest) {
				biggest = custItems[j].totalPrice;
				a = j;
			} else if (custItems[j].totalPrice < smallest) {
				smallest = custItems[j].totalPrice;
				b = j;
			}
		}
	System.out.println("Biggest: " + custItems[a].fname + " " + custItems[a].lname + " (" + String.format("%.2f", biggest) + ")");
	System.out.println("Smallest: " + custItems[b].fname + " " + custItems[b].lname + " (" + String.format("%.2f", smallest) + ")");
	System.out.println("Average: " + String.format("%.2f", average/peoples));
	}	
};