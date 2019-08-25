package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// integer indicating total number of customers
		int count = scan.nextInt();
		
		//creates an array to store customer names
		String[] customer = new String[count];
		
		//reads through each customers order
		for (int i=0; i<customer.length; i++) {
			String fname = scan.next();
			String lname = scan.next();
			int items = scan.nextInt();
			double total = 0;
			//sets amounts, names, and prices to the items bought
			for (int j=0; j<items; j++) {
				int amount = scan.nextInt();
				String name = scan.next();
				double price = scan.nextDouble();
				// calculates total price based on items bought
				total = amount*price + total;
				// print results
			}
			System.out.println(fname + lname + ":" + total);
			
			}
		}
		
	}

