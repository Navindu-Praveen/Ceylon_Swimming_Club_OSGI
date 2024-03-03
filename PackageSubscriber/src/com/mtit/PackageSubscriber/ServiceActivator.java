package com.mtit.PackageSubscriber;

import java.util.Scanner;
import java.util.UUID;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;


import com.mtit.PackageCartPublisher.PackageCartPublisher;
import com.mtit.PackagePaymentPublisher.PackagePaymentPublisher;
import com.mtit.PackagePublisher.PackageDetail;
import com.mtit.PackagePublisher.PackagePublisher;


public class ServiceActivator implements BundleActivator {

	UUID uniqueId = UUID.randomUUID();
	String uniqueNumber = uniqueId.toString().substring(0, 8);

	ServiceReference serviceReference, serviceReference2;
	ServiceReference serviceReferencePayment;

	@Override
	public void start(BundleContext context) throws Exception {

		System.out.println("Start Subscriber Service");
		serviceReference = context.getServiceReference(PackagePublisher.class.getName());
		PackagePublisher packagePublisher = (PackagePublisher) context.getService(serviceReference);

		while (true) {
			PackageDetail respons = packagePublisher.displayMenu();

			String result = respons.getRespons();

			if ("Y".equalsIgnoreCase(result)) {

				serviceReference2 = context.getServiceReference(PackageCartPublisher.class.getName());
				PackageCartPublisher packageCartPublisher = (PackageCartPublisher) context
						.getService(serviceReference2);
				String cartRes = packageCartPublisher.cartMenue(respons.getAmount());

				if (cartRes.equals("Y") || cartRes.equals("y")) {

					serviceReferencePayment = context.getServiceReference(PackagePaymentPublisher.class.getName());
					PackagePaymentPublisher packagePaymentPublisher = (PackagePaymentPublisher) context
							.getService(serviceReferencePayment);
					boolean isvalid = packagePaymentPublisher.displayMenuBuy();

					System.out.println(isvalid);

					if (isvalid == true) {
						System.out.println("                       Payment Successfull!                        ");
						System.out.println("                        Package Activated                          ");
						System.out.println("              Your package reference is " + uniqueNumber);
						System.out.println("                                                   ");
						System.out.println("                                                   ");
						System.out.println();

					}
				}

			}
			System.out.println("Do you want to quit ? (Y/N)");
			Scanner qtsc = new Scanner(System.in);
			String qt = qtsc.next();
			if (qt.equalsIgnoreCase("Y")) {
				System.out.println("Thank you for choosing Ceylon Swimming Club . Have a nice day !");
				System.out.println("                     Have a nice day !                   	   ");
				System.out.println("                                                  			   ");
				System.out.println("                                                  			   ");
				System.out.println("                                                   			   ");
				System.out.println(																	);
			}
		}
	}

	@Override
	public void stop(BundleContext context) throws Exception {

		System.out.println("Stop Subscriber Service, Good Byee!");
		context.ungetService(serviceReference);
	}

}
