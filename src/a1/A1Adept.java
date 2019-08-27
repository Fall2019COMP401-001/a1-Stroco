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
		double biggest = 0;
		double average = 0;
		double smallest = 999999;
		// create count of how many items are in the store
		int itemcount = scan.nextInt();
		// create an array to store each item along with their properties (name and price)
		ItemStuff storeItems[] = new ItemStuff[itemcount];
		for (int i=0; i<itemcount; i++) {
			storeItems[i].foodies = "rawr";
			storeItems[i].price = 0;
			storeItems[i].foodies = scan.next();
			storeItems[i].price = scan.nextDouble();
		}
		// create a count for the number of customers
		int peoples = scan.nextInt();
		// create an array to store each customer and their orders
		Customers custItems[] = new Customers[peoples];
		// a for loop that goes through the customers and their orders one at a time
		for (int j=0; j<peoples; j++) {
			custItems[j].fname = scan.next();
			custItems[j].lname = scan.next();
			// create a count for amount of items bought by customer
			int ibuy = scan.nextInt();
			// new variable in for loop to loop through each item bought
			for (int x=0; x<ibuy; x++) {
				// indicate how much of each item was bought
				int amount = scan.nextInt();
				// sets a name for each item bought to relate to their price
				String itemname = scan.next();
				// new variable "y" to relate the price and names
				for (int y=0; itemname == storeItems[y].foodies; y++)
					custItems[j].totalPrice = amount*storeItems[y].price;
				} 
			// finds the total cost of all the customers combined
			average = custItems[j].totalPrice + average;
			// finds the highest amount spent
			if (custItems[j].totalPrice > biggest) {
				biggest = custItems[j].totalPrice;
			// finds the lowest amount spent
			} 
			if (custItems[j].totalPrice < smallest) {
				 smallest = custItems[j].totalPrice;
			}
		}
for (int z=0; z<peoples; z++) {
	if (biggest == custItems[z].totalPrice) {
		System.out.println("Biggest: " + custItems[z].fname + "" + custItems[z].lname + "(" + custItems[z].totalPrice + ")");
	} 
	if (smallest == custItems[z].totalPrice) {
		System.out.println("Smallest: " + custItems[z].fname + "" + custItems[z].lname + "(" + custItems[z].totalPrice + ")");
	}
}
// figure out how to correspond most money spent and least money spent to a customer
System.out.println("Average: " + average/peoples);
	}
};
