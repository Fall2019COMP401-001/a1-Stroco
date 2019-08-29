package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int storeItems = scan.nextInt();
		
		String stringarr[] = new String[storeItems];
		int intarr[] = new int[storeItems];
		for (int i = 0; i < storeItems; i++) {
			String foodname = scan.next();
			double price = scan.nextDouble();
			stringarr[i] = foodname;
		}
		int peoples = scan.nextInt();
		int peoplesarr[] = new int[storeItems];
		boolean boolarr[] = new boolean[storeItems];
		for (int i = 0; i < peoples; i++) {
			String fname = scan.next();
			String lname = scan.next();
			int amount = scan.nextInt();
			for (int j = 0; j < amount; j++) {
				int quant = scan.nextInt();
				String name = scan.next();
				for (int x = 0; x < storeItems; x++) {
					if (name.contentEquals(stringarr[x])) {
						intarr[x] += quant;
						boolarr[x] = true;
						}
					}
				}
			for (int j = 0; j < storeItems; j++) {
				if (boolarr[j]) {
					peoplesarr[j]++;
					boolarr[j] = false;
				}
			}
			}
		for (int x = 0; x < storeItems; x++) {
				
				if (peoplesarr[x] == 0) {
					System.out.println("No customers bought " + stringarr[x]);
				} else {
					System.out.println(peoplesarr[x] + " customers bought " + intarr[x] + " " + stringarr[x]);
				}
			}
		}
	}


