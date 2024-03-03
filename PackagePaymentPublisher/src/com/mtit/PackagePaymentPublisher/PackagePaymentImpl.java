package com.mtit.PackagePaymentPublisher;

import java.util.Scanner;

public class PackagePaymentImpl implements PackagePaymentPublisher {

	@Override
	public boolean displayMenuBuy() {

		System.out.println();
		System.out.print("Enter your 6 digit Card Number to proceed with the Package purchase : ");
		System.out.println();
		boolean isvalid = false;
		Scanner num = new Scanner(System.in);
		int cCard = num.nextInt();

		while (!isvalid) {

			System.out.print("Enter payment : ");
			System.out.println();
			String ScardNum = String.valueOf(cCard);

			if (ScardNum.length() == 6) {
				isvalid = true;
			} else {
				System.out.println("Invalid Card Number!");
				System.out.println();
				cCard = num.nextInt();
				isvalid = false;

			}

		}

		return isvalid;

	}

}
