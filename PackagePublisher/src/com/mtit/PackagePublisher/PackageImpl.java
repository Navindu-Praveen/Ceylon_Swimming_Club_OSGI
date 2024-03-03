package com.mtit.PackagePublisher;

import java.util.HashMap;
import java.util.Scanner;

public class PackageImpl implements PackagePublisher {

	@Override
	public PackageDetail displayMenu() {

		String con = "Y";
		int amount = 0;

		System.out.println("Publisher start");
		System.out.println();
		System.out.println("========== Online Package Registration =========");
		System.out.println("               Ceylon Swimming Club             ");
		System.out.println("                                                ");
		System.out.println("                Package List               	    ");
		System.out.println("                                                ");
		System.out.println("Bronze Package 		[Rs. 25000]   =  1			");
		System.out.println("Silver Package 		[Rs. 30000]   =  2			");
		System.out.println("Gold Package 		[Rs. 50000]   =  3			");
		System.out.println("Platinum Package 	[Rs. 75000]   =  4			");
		System.out.println("Diamond Package 	[Rs. 100000]  =  5			");
		System.out.println("                                                ");
		System.out.println();
		System.out.println();

		String conBuy = "N";
		while (conBuy.equalsIgnoreCase("N")) {

			System.out.print("Enter Desired Package Number :");
			Scanner optionKey = new Scanner(System.in);
			int selector = optionKey.nextInt();

			HashMap priceMap = new HashMap();
			priceMap.put(1, 25000);
			priceMap.put(2, 30000);
			priceMap.put(3, 50000);
			priceMap.put(4, 75000);
			priceMap.put(5, 100000);

			switch (selector) {

			case 1:
				amount = amount + (Integer) priceMap.get(1);
				System.out.println();
				System.out.println("Package Price Rs. " + priceMap.get(1));
				break;

			case 2:
				amount = amount + (Integer) priceMap.get(2);
				System.out.println();
				System.out.println("Package Price Rs. " + priceMap.get(2));
				break;

			case 3:
				amount = amount + (Integer) priceMap.get(3);
				System.out.println();
				System.out.println("Package Price Rs. " + priceMap.get(3));
				break;

			case 4:
				amount = amount + (Integer) priceMap.get(4);
				System.out.println();
				System.out.println("Package Price Rs. " + priceMap.get(4));
				break;
			case 5:
				amount = amount + (Integer) priceMap.get(5);
				System.out.println();
				System.out.println("Package Price Rs. " + priceMap.get(5));
				break;

			default:
				System.out.println();
				System.out.println("Invalid package number selected. Please enter valid package number");
				continue;
			}

			System.out.println();
			System.out.print("Confirm the selected package? (Y/N): ");
			Scanner contuBUY = new Scanner(System.in);

			conBuy = contuBUY.next();
		}

		return new PackageDetail(conBuy, amount);
	}
}
